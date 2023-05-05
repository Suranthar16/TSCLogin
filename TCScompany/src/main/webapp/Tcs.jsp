<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>TCS</title>

	<link rel="stylesheet" href="Tcs.css">
	<script src="TcsJs.js"></script>

</head>

<body>
<div  align="center">

<form  id="TcsForm" >

<table  border="0" >

	<tr>
		<th colspan="2"><h2>User Regesteration Form</h2></th>
	</tr>

	<tr>
		<th>Name:</th>
		<td><input type="text" id="name" name="name" value="" placeholder="Full name"></td>
		<!-- <td><input type="text" class="message"></td> -->
	</tr>

	<tr>
		<th>Age:</th>
		<td><input type="number" id="age" name="age" value="" placeholder="00"></td>
	</tr>

	<tr>
		<th>D.O.B:</th>
		<td><input type="date" id="dob" name="dob" value="" ></td>
	</tr>

	<tr>
	<th>E-mail:</th>
	<td><input type="email" id="email" name="email" value="" placeholder="xyz@gmail.com"></td>
	</tr>

	<tr>
	<th>Mobile:</th>
	<td><input type="tel" id="mobile" name="mobile" value="" placeholder="xxx xxx xxxx"></td>
	</tr>

	<tr>
	<th>Qualification:</th>
	<td><select  id="qualification" name="qualification" value="" >
		<option value="">--Select--</option>
		<option value="B.E">B.E</option>
		<option value="M.E">M.E</option>
		<option value="B.Sc">B.Sc</option>
		<option value="M.Sc">M.Sc</option>
		<option value="Phd">Phd</option>
		<option value="B.A">B.A</option>
		<option value="M.A">M.A</option>
		<option value="B.Ed">B.Ed</option>
		<option value="M.Ed">M.Ed</option>
	</td>
	</tr>

	<tr>
	<th>Gender:</th>
	<td><input type="radio" id="gender" name="gender" value="Male">Male
		<input type="radio" id="gender1" name="gender" value="Female">Female
		<input type="radio" id="gender2" name="gender" value="Other">Other
		
	</td>
	</tr>

	<tr>
		<th></th>
 		<td><input type="button" id="submt" name="submt" value="Submit" onclick="validate();">
 		<input type="reset" value="Clear"></td>
	</tr>

</table>
</form>
</div>
</body>
</html>