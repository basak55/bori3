<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<form action="check" method="post">
	<input type="text" readOnly value="${sent.sent}" name="quest"/>
	<input type="text" name="inputText"/>
	<button type="submit">완료</button>
</form>
</div>


</body>
</html>