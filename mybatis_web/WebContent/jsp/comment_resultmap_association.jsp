<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
CommentUser commentUser = commentService.selectCommentByPrimaryKeyAssociation(commentNo);
%>
댓글번호 : <%= commentUser.getComment().getCommentNo() %><br>
댓글작성자 : <%= commentUser.getComment().getUserId() %><br>
댓글작성일시 : <%= commentUser.getComment().getRegDate() %><br>
댓글내용 : <%= commentUser.getComment().getCommentContent() %><br>

댓글작성자 : <%= commentUser.getUser().getUserId() %><br>
댓글작성자명 : <%= commentUser.getUser().getUserName() %><br>