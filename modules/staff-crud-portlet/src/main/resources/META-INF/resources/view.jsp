<%@ page import ="staff.service.model.Staff" %>
<%@ page import ="java.util.*" %>

<%@ include file="init.jsp"%>
<portlet:defineObjects />
 
<%  List<Staff> staffList = (List<Staff>)request.getAttribute("staffList"); %>
<portlet:renderURL var="addStaffRenderURL">
    <portlet:param name="mvcPath" value="/add-staff.jsp"/>
</portlet:renderURL>
 
<div class="mb-5">
    <a href="<%= addStaffRenderURL %>" class="btn  btn-success btn-default">
        <i class="glyphicon glyphicon-plus"></i> Add Staff
    </a>
</div>
<table class="table table-striped">
    <tr >
        <th>Staff Name</th>
        <th>Staff Department</th>
        <th>Staff Organization</th>
        <th>Staff Age</th>
        <th>Staff Employer</th>
        <th>Staff Date Employed</th>
        
        <th colspan="2" style="width: 100px"><B>Update / Delete</B></th>
    </tr>
    <c:forEach items="${staffList}" var="staff">  
    
        <portlet:renderURL var="updateStaffRenderURL">
            <portlet:param name="mvcPath" value="/update-staff.jsp"/>
            <portlet:param name="staffName" value="${staff.staffName}"/>
            <portlet:param name="staffDept" value="${staff.staffDept}"/>
            <portlet:param name="staffOrg" value="${staff.staffOrg}"/>
            <portlet:param name="staffAge" value="${staff.staffAge}"/>
            <portlet:param name="staffEmployer" value="${staff.staffEmployer}"/>
            
            <portlet:param name="staffDateEmployed" value="${staff.staffDateEmployed}"/>
            
            <portlet:param name="staffId" value="${staff.staffId}"/>
        </portlet:renderURL>
        
        <portlet:actionURL name="deleteStaff" var="deleteStaffActionURL">
            <portlet:param name="staffId" value="${staff.getStaffId()}"/>
        </portlet:actionURL>
                
        <tr> 
            <td>${staff.getStaffName()}</td>
            <td>${staff.getStaffDept()}</td>
            <td>${staff.getStaffOrg()}</td>
            <td>${staff.getStaffAge()}</td>
            <td>${staff.getStaffEmployer()}</td>
            <td>${staff.getStaffDateEmployed()}</td>
            
            <td class="text-center" style="width: 50px">
                <a href="<%=updateStaffRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
                <i class ="glyphicon glyphicon-edit"></i>
                </a>
            </td> 
            <td class="text-center" style="width:50px">
                <a href="<%=deleteStaffActionURL%>" 
                    class="btn  btn-primary btn-danger btn-sm px-2 py-1"
                    onclick="return confirm('Are you sure you want to delete this Staff?');"> 
                    <i class ="glyphicon glyphicon-remove"></i>
                </a>
            </td>                                     
         </tr>
    </c:forEach>
</table>
