<%@page import="java.io.*,javax.servlet.*,ldg.mybatis.service.*" contentType="text/html; charset=utf8"%>
<%
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentService commentService = new CommentService();
Integer result = commentService.deleteComment(commentNo);
%>
<%= result %>