<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapperDynamicSql.xml의 selectCommentByConditionTrim매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
String userId = request.getParameter("userId");
CommentDynamicSqlService commentService = new CommentDynamicSqlService();
List<Comment> comments = commentService.selectComment(commentNo, userId);
%>
<% for( Comment comment : comments ){ %>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br>
<% } %>