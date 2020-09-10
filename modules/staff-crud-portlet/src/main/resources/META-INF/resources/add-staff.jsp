
<%@ include file="init.jsp"%>
<portlet:defineObjects />

<portlet:actionURL name="addStaff" var="addStaffActionURL"/>
			
				
<h2>Add Student here !</h2>

<aui:form action="<%=addStaffActionURL %>" name="staffForm" method="POST">
	<aui:input name="staffName" >
 		<aui:validator name="required"/>
 		<aui:validator name="string"/>
	</aui:input>

	<aui:input name="staffDept" >
 		<aui:validator name="required"/>
 		<aui:validator name="string"/>
	</aui:input>

	<aui:input name="staffOrg" >
 		<aui:validator name="required"/>
 		<aui:validator name="string"/>
	</aui:input> 

	<aui:input name="staffAge" >
 		<aui:validator name="required"/>
 		<aui:validator name="string"/>
	</aui:input>

	<aui:input name="staffEmployer">
 		<aui:validator name="required"/>
 		<aui:validator name="string"/>
	</aui:input>  
	
	<aui:input name="staffDateEmployed" type="date" >
	
 		<aui:validator name="required"/>
 		<aui:validator name="date"/>
 		 		
 
	</aui:input>

	<aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>
