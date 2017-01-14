<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="brad" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
<brad:MyCal x="100" y="33">
	10 + 3 = ${addResult }<br />
	10 + 3 = ${subResult }<br />
	10 + 3 = ${multiplyResult }<br />
	10 + 3 = ${divideResult }<br />
</brad:MyCal>
</body>
</html>