<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${formations}" var="formation">
<h3>Id Formation: ${formation.id}</h3>
<h3>theme Formation: ${formation.theme}</h3>
</c:forEach>
</body>
</html>