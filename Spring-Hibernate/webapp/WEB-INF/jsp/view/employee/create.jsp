<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<spring:message code="title.create.employee" />
	</h2>
	<c:if test="${validationErrors != null}">
		<div class="errors">
			<ul>
				<c:forEach items="${validationErrors}" var="error">
					<li><c:out value="${error.message}" /></li>
				</c:forEach>
			</ul>
		</div>
	</c:if>
	<form:form method="post" modelAttribute="employeeForm">
		<form:label path="firstName">
			<spring:message code="form.first.name" />
		</form:label>
		<br />
		<form:input path="firstName" />
		<br />
		<form:errors path="firstName" cssClass="errors" />
		<br />
		<form:label path="middleName">
			<spring:message code="form.middle.name" />
		</form:label>
		<br />
		<form:input path="middleName" />
		<br />
		<form:errors path="middleName" cssClass="errors" />
		<br />
		<form:label path="lastName">
			<spring:message code="form.last.name" />
		</form:label>
		<br />
		<form:input path="lastName" />
		<br />
		<form:errors path="lastName" cssClass="errors" />
		<br />
		<form:label path="email">
			<spring:message code="form.email" />
		</form:label>
		<br />
		<form:input path="email" />
		<br />
		<form:errors path="email" cssClass="errors" />
		<br />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>