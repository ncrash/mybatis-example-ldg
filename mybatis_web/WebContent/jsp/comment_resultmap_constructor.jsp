<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyConstructor(commentNo);
%>
<%= comment %>