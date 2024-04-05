<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.container {max-width:1024px; margin:30px auto;}
.checkTypo input {width:80%;}
</style>
</head>
<body>
<div class="container">
	<h4>명언 필사하기</h4>
	<form class="checkTypo" action="check" method="post">
		<div>
			<input type="text" readOnly value="${sent.sent}" name="quest" />
			<label>${sent.writer}</label>
		</div>
		<div>
			<input type="text" name="inputText" />
			<button type="submit">완료</button>
		</div>
	</form>
</div>
<a href="#" id="endGame" class="btn" value="playTime">종료하기</a>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script>
var startTime = new Date();
//console.log(startTime);
$('#endGame').click(function() {
    var endTime = new Date();
    var timeSpent = endTime - startTime;    
    var playTime = Math.round(timeSpent / (1000 * 60)); // 밀리초를 분으로 변환
//	console.log(playTime);
    
    
    
});
</script>

</body>
</html>