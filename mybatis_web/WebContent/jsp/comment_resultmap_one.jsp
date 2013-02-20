<%@page import="java.io.*,java.util.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentResultMapService = new CommentResultMapService();
Comment comment = commentResultMapService.selectByPrimaryKey(commentNo);
%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br>