<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
<c:set var="x" value="11" scope="page" />
<%
	pageContext.setAttribute("x", "11");
%>
<c:set var="x" value="12" scope="request" />
<c:set var="x" value="13" scope="session" />
<c:set var="x" value="14" scope="application" />
<c:out value="${sessionScope.x }" />
</body>
</html>