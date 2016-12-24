<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
<c:set var="num" value="1234567.89"/>
<fmt:setLocale value="zh"/>
<fmt:formatNumber value="${num }" type="currency" currencyCode="INR"/><br>
<fmt:setLocale value="fr"/>
<fmt:formatNumber value="${num }" type="currency"/><br>
<fmt:setLocale value="ja"/>
<fmt:formatNumber value="${num }" type="currency" currencyCode="JPY"/><br>

<fmt:setLocale value="de"/>
<fmt:parseNumber value="56.789,321" var="price" />
${price }


</body>
</html>