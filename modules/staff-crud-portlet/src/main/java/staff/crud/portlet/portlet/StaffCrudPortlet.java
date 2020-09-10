package staff.crud.portlet.portlet;

import staff.crud.portlet.constants.StaffCrudPortletKeys;
import staff.service.model.Staff;
import staff.service.service.StaffLocalService;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

//import java.awt.List;
import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=StaffCrud",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StaffCrudPortletKeys.STAFFCRUD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StaffCrudPortlet extends MVCPortlet {
	 private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	    
	    @Reference
	    CounterLocalService counterLocalService;
	    
	    @Reference
	    StaffLocalService staffLocalService;
	 
	    @ProcessAction(name = "addStaff")
	    public void addStaff(ActionRequest actionRequest,ActionResponse actionResponse) {
	        long staffId = counterLocalService.increment(Staff.class.getName());
	        String staffName = ParamUtil.getString(actionRequest, "staffName");
	        String staffDept = ParamUtil.getString(actionRequest, "staffDept");
	        String staffOrg = ParamUtil.getString(actionRequest, "staffOrg");
	        String staffAge = ParamUtil.getString(actionRequest, "staffAge");
	        
	        String staffEmployer = ParamUtil.getString(actionRequest, "staffEmployer");
	        String staffDateEmployed = ParamUtil.getString(actionRequest, "staffDateEmployed");
	    
	        Staff staff = staffLocalService.createStaff(staffId);
	        staff.setStaffName(staffName);
	        staff.setStaffDept(staffDept);
	        staff.setStaffOrg(staffOrg);
	        staff.setStaffAge(staffAge);
	        staff.setStaffEmployer(staffEmployer);
	        staff.setStaffDateEmployed(staffDateEmployed);
	        
	        staffLocalService.addStaff(staff);
	    }
	    
	    @Override
	    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
	        List<Staff> staffList = staffLocalService.getStaffs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	        renderRequest.setAttribute("staffList", staffList);        
	        super.render(renderRequest, renderResponse);
	    }
	    
	    @ProcessAction(name = "updateStaff")
	    public void updateStaff(ActionRequest actionRequest,  ActionResponse actionResponse) {
	        long staffId = ParamUtil.getLong(actionRequest,"staffId", GetterUtil.DEFAULT_LONG);
	        String staffName = ParamUtil.getString(actionRequest, "staffName", GetterUtil.DEFAULT_STRING);
	        String staffDept = ParamUtil.getString(actionRequest, "staffDept", GetterUtil.DEFAULT_STRING);
	        String staffOrg = ParamUtil.getString(actionRequest, "staffOrg", GetterUtil.DEFAULT_STRING);
	        String staffAge = ParamUtil.getString(actionRequest, "staffAge", GetterUtil.DEFAULT_STRING);
	        
	        String staffEmployer = ParamUtil.getString(actionRequest, "staffEmployer", GetterUtil.DEFAULT_STRING);
	        String staffDateEmployed = ParamUtil.getString(actionRequest, "staffDateEmployed", GetterUtil.DEFAULT_STRING);
	        
	        Staff staff = null;
	        try {
	            staff = staffLocalService.getStaff(staffId);
	        } catch (Exception e) {
	            log.error(e.getCause(), e);
	        }
	 
	        if(Validator.isNotNull(staff)) {
	        	staff.setStaffName(staffName);
		        staff.setStaffDept(staffDept);
		        staff.setStaffOrg(staffOrg);
		        staff.setStaffAge(staffAge);
		        staff.setStaffEmployer(staffEmployer);
		        staff.setStaffDateEmployed(staffDateEmployed);
	            staffLocalService.updateStaff(staff);
	        }
	    }
	 
	    @ProcessAction(name = "deleteStaff")
	    public void deleteStaff(ActionRequest actionRequest, ActionResponse actionResponse){
	        long staffId = ParamUtil.getLong(actionRequest, "staffId", GetterUtil.DEFAULT_LONG);
	        try {
	            staffLocalService.deleteStaff(staffId);
	        } catch (Exception e) {
	            log.error(e.getMessage(), e);
	        }
	    }
}