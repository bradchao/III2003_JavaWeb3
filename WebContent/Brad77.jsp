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
<%
	// csv => read line
	String line = "1,brad,male,0912-123456,2000-01-02,台中市西屯區";
	pageContext.setAttribute("str", line);
%>
<c:forTokens items="${str }" delims="," var="field" 
	begin="2" end="5" step="1">
${field }<br>
</c:forTokens>




</body>
</html>