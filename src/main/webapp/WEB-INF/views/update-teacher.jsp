<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:form action="updateTeacher" modelAttribute="updateteacher">
			
			<c:label path="teacherId"></c:label>
			<c:input path="teacherId" placeholder="enter teacherId"/>
			
			<c:label path="teacherName"></c:label>
			<c:input path="teacherName" placeholder="enter teacherName"/>
			
			<c:label path="teacherSubject"></c:label>
			<c:input path="teacherSubject" placeholder="enter teacherSubject"/>
			
			<c:button type="submit">update</c:button>
		</c:form>
</body>
</html>