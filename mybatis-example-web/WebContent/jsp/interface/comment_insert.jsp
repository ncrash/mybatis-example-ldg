<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
//인터페이스만으로 매핑구문과 결과매핑 처리
//ldg.mybatis.repository.mapper.CommentMapper.insertComment(Comment)
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
String userId = request.getParameter("userId");
String commentContent = request.getParameter("commentContent");
Comment comment = new Comment(commentNo, userId, Calendar.getInstance().getTime(), commentContent);
CommentService commentService = new CommentService();
Integer result = commentService.insertComment(comment);
%>
<%= result %>
