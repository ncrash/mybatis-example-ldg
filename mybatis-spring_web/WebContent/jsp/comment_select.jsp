<%@page import="java.io.*,javax.servlet.*,java.util.*,ldg.mybatis.service.*,ldg.mybatis.model.*,org.springframework.context.*,org.springframework.context.support.*" contentType="text/html; charset=utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf8"></head>
<body>
<%
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentService commentService = (CommentService)applicationContext.getBean("commentService");
List<Comment> result = commentService.selectComment(commentNo);
%>
<% for( Comment comment : result ) { %>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br>
<% } %>
</body>
</html>