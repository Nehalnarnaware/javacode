<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing  Final List </title>
</head>
<body>
 <h2> Final Billing Info</h2>
 <hr>
 
    First Name : ${bill.firstName}<br/>
    Last Name : ${bill.lastName}<br/>
    Email : ${bill.email}<br/>
    Mobile : ${bill.mobile}<br/>
    Product : ${bill.product}<br/>
    Amount Paid : ${bill.amount}<br/>
    Mode : ${bill.mode}
 
  
   <form action="sendEmail" method="post">
     
     <input type="hidden" name="email" value="${bill.email}"/>
    
     <input type="submit" value="sendemail"/>
     
     </form>
</body>
</html>