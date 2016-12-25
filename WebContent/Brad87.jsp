<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource 
	dataSource="jdbc:sqlserver://localhost:1433;databaseName=LabDB,com.microsoft.sqlserver.jdbc.SQLServerDriver,sa,sa" 
	var="labdb" 
	/>
<sql:setDataSource driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost/iii" user="root" password="root" 
	var="iii" scope="session"/> 

<sql:query var="result1" dataSource="${iii }">
select * from member
</sql:query>
<sql:query var="result2" dataSource="${labdb }">
select * from LabTable
</sql:query>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>

MySQL: Total: ${result1.rowCount }
<hr>
MsSQL: Total: ${result2.rowCount }

</body>
</html>