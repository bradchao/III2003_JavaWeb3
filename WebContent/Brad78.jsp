<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
Header
<hr>
<c:import url="import.txt" var="import2"/><br>
<jsp:include page="import.txt" />
<hr>
${import2}
<hr>
<c:catch>
<c:import url="Brad79.jsp">
	<c:param name="x" value="10" />
	<c:param name="y" value="3" />
</c:import>
</c:catch>
<hr>
<c:url value="http://www.iii.org.tw" var="iiiurl" />

<hr>
<jsp:include page="login.html" />
<hr>
<c:import url="http://www.iii.org.tw" />
<hr>
Footer


</body>
</html>