<%@page import="java.io.*,javax.servlet.*,ldg.mybatis.service.*" contentType="text/html; charset=utf8"%>
<%
// 인터페이스만으로 매핑구문과 결과매핑 처리
// ldg.mybatis.repository.mapper.CommentMapper.deleteComment(Long)
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentService commentService = new CommentService();
Integer result = commentService.deleteComment(commentNo);
%>
<%= result %>