<%@page import="org.apache.logging.log4j.core.Logger"%>
<%@page import="java.io.PrintWriter"%>
<%@ page import ="java.util.*"%>
<%@page import="java.io.PrintStream"%>
<%@page import="DTO.TcsDTO"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>TCS</title>

	<link rel="stylesheet" href="Tcs.css">
	<script src="Tcs4js.js"></script>

</head>

<body>
<div  align="center">

<form  id="Tcs4Form" name="Tcs4Form">

<table  border="0" >

<% ArrayList<TcsDTO> list= (ArrayList<TcsDTO>)session.getAttribute("Retrivelist");%>

<%
String emailVal=(String)request.getParameter("email"); 
if(emailVal!=null){
%>

<%}
%>
<%
String  Male="";
String Female="";
String Other="";
TcsDTO dto1=new TcsDTO();
if(list!=null){
	%>
	<%

	for(int i=0;i<list.size();i++){
	 TcsDTO dto= list.get(i);
	 %>
		
		<%
		 if(emailVal!=null&&dto.getEmail() !=null&&dto.getEmail().equals(emailVal)) { 
			
              dto1=dto;
              %>
      	
      		<%              }
				 
		
	}
		 
	    String gen=dto1.getGender();
	 if(gen!=null&&gen.trim().equals("Male")){
		 Male="Checked";
	 }else  if(gen!=null&&gen.trim().equals("Female")){
		 Female="Checked";
	 }else if(gen!=null&&gen.trim().equals("Other")){
		 Other="Checked";
	 }
	 
}
     %>
     

	<tr>
		<th colspan="2"><h2>User Regesteration Form</h2></th>
	</tr>

	<tr>
		<th>Name:</th>
		<td><input type="text" id="name" name="name" value="<%=dto1.getName() %>" placeholder="Full name"></td>
	</tr>

	<tr>
		<th>Age:</th>
		<td><input type="number" id="age" name="age" value="<%=dto1.getAge() %>" placeholder="00"><br><small>errorMessage()</small></td>
	</tr>

	<tr>
		<th>D.O.B:</th>
		<td><input type="date" id="dob" name="dob" value="<%=dto1.getDob() %>" ><br><small>errorMessage()</small></td>
	</tr>

	<tr>
	<th>E-mail:</th>
	<td><input type="email" id="email" name="email" value="<%=dto1.getEmail() %>" placeholder="xyz@gmail.com"><br><small>errorMessage()</small></td>
	</tr>

	<tr>
	<th>Mobile:</th>
	<td><input type="tel" id="mobile" name="mobile" value="<%=dto1.getMobile() %>" placeholder="xxx xxx xxxx"><br><small>errorMessage()</small></td>
	</tr>

	<tr>
	<th>Qualification:</th>
	<td><select  id="qualification" name="qualification"  >
		<option >--Select--</option>
		<option value="B.E">B.E</option>
		<option value="M.E">M.E</option>
		<option value="B.Sc">B.Sc</option>
		<option value="M.Sc">M.Sc</option>
		<option value="Phd">Phd</option>
		<option value="B.A">B.A</option>
		<option value="M.A">M.A</option>
		<option value="B.Ed">B.Ed</option>
		<option value="M.Ed">M.Ed</option>
		</select>
	<small>errorMessage() </small></td>
	</tr>

	<tr>
	<th>Gender:</th>
	 
	 <td>
		<input type="radio" id="gender" name="gender" value="Male" <%=Male %>>Male
		<input type="radio" id="gender1" name="gender" value="Female"<%=Female %>>Female
		<input type="radio" id="gender2" name="gender" value="Other"<%=Other %>>Other
		<br><small>"errorMessage();"</small>
	</td>
	</tr>

	<tr>
		<th></th>
 		<td><input type="button" id="submt" name="submt" value="Update" onclick="validate();">
 		<input type="reset" value="Clear"></td>
	</tr>
	
</table>
</form>
<script type="text/javascript"> document.getElementById("qualification").value="<%=dto1.getQualification() %>";

</script>
</div>
</body>
</html>