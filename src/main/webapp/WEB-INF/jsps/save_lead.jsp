<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2>  Lead </h2>
<hr>
<form action="savelead" method="post">
<pre>
   FirstName:<input type="text" name="firstName"/>
   LastName:<input type="text" name="lastName"/>
   Email:<input type="text" name="email"/>
   LeadSource:
   <select name="leadSource" >
  <option value="tv commercial">TV commercial</option>
  <option value="radio">Radio</option>
  <option value="newspaper">NewsPaper</option>
  <option value="online">online</option>
 </select>
   Mobile:<input type="text" name="mobile"/>

   <input type="submit" value="save"/>




</pre>

</form>


</body>
</html>