<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.iii.org.tw/brad/tags" prefix="mytag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>

<mytag:if test="${param.name == 'brad' }">
doTag(): Hello, Brad
</mytag:if>
<hr />

<mytag:loop var="name" items="${names }">

</mytag:loop>


</body>
</html>