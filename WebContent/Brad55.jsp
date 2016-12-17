<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
<%
	application.setAttribute("x", 123);
	request.setAttribute("x", (int)(Math.random()*49+1));

	String x = request.getParameter("x");
	Integer intX = (Integer)request.getAttribute("x");
	out.print(x + "<br>");
	out.print(intX + "<br>");

%>
<a href='Brad56.jsp'>Brad56</a>


</body>
</html>