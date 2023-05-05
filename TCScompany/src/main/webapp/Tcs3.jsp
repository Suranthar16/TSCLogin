<%@ page import ="java.util.ArrayList"%>
<%@page import="DTO.TcsDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TCS3</title>
  <link rel="stylesheet" href="Tcs3.css">
  
  <script type="text/javascript">
  
  function deletfn(email) {
	  
	  /*  alert("INSIDE DELETE FUNCTION!"+email); */
	   document.getElementById("Tcs3form").action="Tcs3Servlet?emailVal="+email;
	   document.getElementById("Tcs3form").method="post" ;
	   document.getElementById("Tcs3form").submit();
	
	    
	}

	  function editfn(email) {
		  /* alert(email); */
		 // sessionStorage.setItem("email",email);
		  
		/*  sessionStorage.getItem("lastname");*/
		
	   /*  alert("INSIDE UPADATE FUNCTION!"); */
	    document.getElementById("Tcs3form").action="Tcs4.jsp?email="+email;
		document.getElementById("Tcs3form").method="post" ;
		document.getElementById("Tcs3form").submit();
	   
	}
  </script>
  
  <script type="text/javascript" src="jquery-3.6.4.min.js"></script>
  
  
</head>
<body>
<form id="Tcs3form">

<h2 style="text-align: center;">User Regesteration Form</h2>
<p>If you need any changes , please chech and provide the detials</p>
<table>

<%
ArrayList<TcsDTO> list= (ArrayList<TcsDTO>)session.getAttribute("Retrivelist");
/* System.out.println("list"+list.size());

 */

%>


<tr>
	<th>Name</th>
	<th>Age</th>
	<th>D.O.B</th>
	<th>E-mail</th>
	<th>mobile</th>
	<th>Qualification</th>
	<th>Gender</th>
	<th>Edit/Update</th>
	<th>Delet</th>
</tr>


<% if(list!=null){
	for(int i=0;i<list.size();i++){
		TcsDTO dto=list.get(i);
		
	%>
<tr>
	<td><%=dto.getName() %></td>
	<td><%=dto.getAge() %></td>
	<td><%=dto.getDob() %></td>
	<td><%=dto.getEmail() %></td>
	<td><%=dto.getMobile() %></td>
	<td><%=dto.getQualification() %></td>
	<td><%=dto.getGender() %></td>
	<td> <input type="button"  id="update" name="update" value="update" onclick="editfn('<%=dto.getEmail()%>')"></td>
	<td> <input type="button"  id="delet" name="delet" value="delet" onclick="deletfn('<%=dto.getEmail()%>')"></td>
</tr>

<%}
	} %>
	
</table>
</form>
</body>
</html> 