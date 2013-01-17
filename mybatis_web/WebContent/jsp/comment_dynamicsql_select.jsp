<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
String userId = request.getParameter("userId");
CommentDynamicSqlService commentService = new CommentDynamicSqlService();
List<Comment> comments = commentService.selectComment(commentNo, userId);
%>
<%= comments %>