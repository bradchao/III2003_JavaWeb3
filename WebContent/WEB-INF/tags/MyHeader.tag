<%@tag description="My Header" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="pagename" %>
<%@attribute name="func" %>
<%@attribute name="url" %>
<%@attribute name="year" %>
<h1>Brad Big Company</h1>
<hr />
${pagename }:<a href="${url }">${func }</a>
<hr />
<jsp:doBody />
<hr />
Copyright ${year }
