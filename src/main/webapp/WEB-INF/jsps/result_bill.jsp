<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Bills</title>
</head>
<body>
<h2>Result | All Bills</h2>
<hr>
 <table>

     <tr>
		  <th>Id</th>
		  <th>First Name</th>
		  <th>Last Name</th>
		  <th>Email</th>
		  <th>Lead Source</th>
		  <th>Mobile</th>
	      <th>Product</th>
	      <th>Amount</th>
	      <th>Mode</th>
	      
     </tr>

  <c:forEach var="bill" items="${bills}">
  
  
   <tr>
	  <td>${bill.id}</td>
	  <td><a href="getContactById?id=${contact.id}" >${bill.firstName}</a> </td>  
	  <td>${bill.lastName}</td>
	  <td>${bill.email}</td>
	  <td>${bill.leadSource}</td>
	  <td>${bill.mobile}</td>
	  <td>${bill.product}</td>
	  <td>${bill.amount}</td>
	   <td>${bill.mode}</td>
  </tr>
 
  
  
  </c:forEach>


</table>
      
</body>
</html>