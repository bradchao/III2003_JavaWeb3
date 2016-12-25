<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost/iii" user="root" password="root" 
	var="iii" scope="page"/> 

<sql:update dataSource="${iii }">
insert into member (account,passwd,realname) values ('ok','123','Ok')
</sql:update>

<sql:query var="result" dataSource="${iii }">
select * from member
</sql:query>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>

MySQL: Total: ${result.rowCount }
<hr>
<c:forEach items="${result.rows}" var="member">
${member.id }:${member.account }:${member.passwd }<br>
</c:forEach>
</body>
</html>