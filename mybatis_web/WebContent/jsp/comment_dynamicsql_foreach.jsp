<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
String[] commentNos = request.getParameterValues("commentNos");
CommentDynamicSqlService commentService = new CommentDynamicSqlService();
List<Comment> comments = commentService.selectCommentForeach(commentNos);
%>
<%= comments %>