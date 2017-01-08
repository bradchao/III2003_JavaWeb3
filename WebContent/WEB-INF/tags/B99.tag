<%@tag description="9 x 9" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border='1' width='100%'>
	<tr>
		<c:forEach begin="2" end="5" var="y">
			<td>
			${y } x 1 = ${y }<br>
			</td>
		</c:forEach>
	</tr>
</table>