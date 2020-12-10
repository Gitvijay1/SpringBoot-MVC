<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>WELCOME TO DATA PAGE</h1>
  <table border="1">
     <tr>
       <th>PID</th>
       <th>PNAME</th>
       <th>COST</th>
       <th>DISCOUNT</th>
       <th>GST</th>
       </tr>
       <c:forEach items="${data}" var="ob">
         <tr>
           <td>${ob.pid}</td>
           <td>${ob.pname}</td>
           <td>${ob.cost}</td>
           <td>${ob.pDiscount}</td>
           <td>${ob.pGst}</td> 
         </tr>
       </c:forEach>
  </table>
</body>
</html>