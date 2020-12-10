<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <a href="reg">Register</a>
    <a href="all">ViewAll</a> 
  </tr>
  <hr>
</table>
 <h1>WELCOME TO REGISTRATION PAGE</h1>
 <form action="save" method="post">
 <pre>
   EMP ID:<input type="text" name="eid"/>
   EMP NAME:<input type="text" name="ename"/>
   JOB:<input type="text" name="job"/>
    SAL:<input type="text" name="sal"/>
    <input type="submit" value="register"/>
   </pre>
 </form>
 ${Massage}
</body>
</html>