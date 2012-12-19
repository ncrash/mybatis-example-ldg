<%@page contentType="text/html; charset=utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>result</title>
</head>
<body>
댓글번호 : ${result.commentNo } <br>
작성자 아이디 : ${result.userId } <br>
댓글내용 : ${result.commentContent } <br>
</body>
</html>