<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="brad" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Brad Big Company</title>
</head>
<body>
<c:set var="account" value="bradchao" />
<c:if test="${fn:contains(account, 'brad') }">
${fn:length(account) }
</c:if>
<hr />
<brad:MyCal x="100" y="33">
	10 + 3 = ${addResult }<br />
	10 + 3 = ${subResult }<br />
	10 + 3 = ${multiplyResult }<br />
	10 + 3 = ${divideResult }<br />
</brad:MyCal>
<hr />
<brad:MyData title='詳細資料' 姓名='Brad' 性別='male' 年齡='50' />

</body>
</html>