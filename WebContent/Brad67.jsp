<%@page import="java.util.HashMap"%>
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
	String[] names = {"Brad","John","Steve"};
	request.setAttribute("urname", names);
%>
Name1 : ${urname[0] }<br>
Name2 : ${urname[1] }<br>
Name3 : ${urname[2] }<br>
<hr>
<%
	HashMap<String,String> data = new HashMap<>();
	data.put("name", "Brad");
	data.put("passwd", "123456");
	data.put("gender", "male");
	request.setAttribute("data", data);
%>
User: ${data.name }<br>
Password: ${data.passwd }<br>
Gender: ${data.gender }<br>

</body>
</html>