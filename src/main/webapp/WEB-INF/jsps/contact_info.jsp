<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Info</h2>
	<hr>

        First Name : ${contact.firstName}<br/>
        Last Name : ${contact.lastName}<br/>
        Email : ${contact.email} <br/>
        LeadSource: ${contact.leadSource}<br/>
        Mobile : ${contact.mobile}<br/>
     
     <form action="sendEmail" method="post">
     
     <input type="hidden" name="email" value="${contact.email}"/>
    
     <input type="submit" value="sendemail"/>
     
     </form>
    
     
     
</body>
</html>