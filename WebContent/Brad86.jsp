<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	// JSP
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = 
				"jdbc:sqlserver://localhost:1433;" + 
			"databaseName=LabDB;user=sa;password=sa;"; 
		Connection conn = 
				DriverManager.getConnection(connectionUrl);
		Statement stmt = conn.createStatement();
		stmt.execute("insert into LabTable (id,data) values (5,'World')");
		
		
		System.out.println("OK");
	}catch(Exception e){
		System.out.println("E:" + e.toString());
	}

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>

</body>
</html>