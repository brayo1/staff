
<%@ include file="init.jsp"%>
<portlet:defineObjects/>

<portlet:actionURL name="updateStaff" var="updateStaffActionURL"/>

<aui:form action="<%=updateStaffActionURL%>" name="staffForm" method="POST"/>

<%
	String staffId = renderRequest.getParameter("staffId");
	String staffName = renderRequest.getParameter("staffName");
	String staffDept = renderRequest.getParameter("staffDept");
	String staffOrg = renderRequest.getParameter("staffOrg");
	String staffAge = renderRequest.getParameter("staffAge");
	String staffEmployer = renderRequest.getParameter("staffEmployer");
	
	String staffDateEmployed = renderRequest.getParameter("staffDateEmployed");
%>
<aui:form action="<%= updateStaffActionURL %>" method="post" >
	<aui:input name="staffId" type="hidden" value="<%=Long.parseLong(staffId)%>"/>
	<aui:input name="staffName" type="text" value="${staff.staffName}"/>
	<aui:input name="staffDept" type="text" value="${staff.staffDept}"/>
	<aui:input name="staffOrg" type="text" value="${staff.staffOrg}" />
	<aui:input name="staffAge" type="text" value="${staff.staffAge}" />
	<aui:input name="staffEmployer" type="text" value="${staff.staffEmployer}"/> 
	<aui:input name="staffDateEmployed" type="text" value="${staff.staffDateEmployed}"/> 
	
	<aui:input type="submit" value="Update" name="" class="btn  btn-primary btn-danger btn-sm px-2 py-1"></aui:input>
</aui:form>
