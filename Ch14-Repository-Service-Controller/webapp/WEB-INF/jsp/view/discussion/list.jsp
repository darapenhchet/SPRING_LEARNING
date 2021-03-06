<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Discussion List</title>
    </head>
    <body>
        <h2>Discussions</h2>
        [<a href="<c:url value="/discussion/create" />">new discussion</a>]<br />
        <br />
        <c:choose>
            <c:forEach items="${discussions}" var="discussion">
                <a href="<c:url value="/discussion/${discussion.id}/${discussion.uriSafeSubject}" />">
                    <c:out value="${discussion.subject}" /></a><br />
                (<c:out value="${discussion.user}" />)<br/>
            </c:forEach>
        </c:choose>
    </body>
</html>