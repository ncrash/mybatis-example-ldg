<%@page import="java.io.*,javax.servlet.*,java.util.*,ldg.mybatis.service.*,ldg.mybatis.model.*,org.springframework.context.*,org.springframework.context.support.*" contentType="text/html; charset=utf8"%>
<%
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

Long commentNo = Long.parseLong(request.getParameter("commentNo"));
String userId = request.getParameter("userId");
String commentContent = request.getParameter("commentContent");
Comment comment = new Comment(commentNo, userId, Calendar.getInstance().getTime(), commentContent);
CommentService commentService = (CommentService)applicationContext.getBean("commentService");
Integer result = commentService.withSpringJdbc(comment);
%>
<%= result %>