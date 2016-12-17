<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:directive.page import="tw.brad.j2ee.Member" />
<%
	Member member = new Member();
	member.setId("003"); member.setName("John");
%>
<%! int j; %>
<jsp:declaration>
int i;
String name;
</jsp:declaration>

<jsp:scriptlet>
j++;
i += j;
name = "Brad";
</jsp:scriptlet>
<%
%>
<jsp:expression>
name
</jsp:expression>
<%= name %>
<jsp:text>
I am Brad
</jsp:text>
I am Brad

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
Welcome, <%= member.getName() %><br>
<%= i %><br>
<%= j++ %><br>
</body>
</html>