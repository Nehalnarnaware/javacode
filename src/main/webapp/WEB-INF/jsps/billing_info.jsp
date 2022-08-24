<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
 <h2>Billing | create</h2>
 <hr>
<form action="generatebill" method="post">
<pre>
    FirstName:<input type="text" name="firstName" value="${contact.firstName}"/>
    LastName:<input type="text" name="lastName" value="${contact.lastName}"/>
    Email:<input type="text" name="email" value="${contact.email}"/>
    Mobile:<input type="text" name="mobile" value="${contact.mobile}"/>
    Product<input type="text" name="product"/>
    Amount Paid <input type="text" name="amount"/>
    Mode Of Payment:
    Cash<input type="radio" name="mode" value="cash">
    Online<input type="radio" name="mode" value="online">
   <input type="submit" value="generate"/>
   
</pre>

</form>
</body>
</html>