<%@page import="java.io.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*,org.springframework.context.*,org.springframework.context.support.*" contentType="text/html; charset=utf8"%>
<%
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentService commentService = (CommentService)applicationContext.getBean("commentService");
Integer result = commentService.deleteComment(commentNo);
%>
<%= result %>