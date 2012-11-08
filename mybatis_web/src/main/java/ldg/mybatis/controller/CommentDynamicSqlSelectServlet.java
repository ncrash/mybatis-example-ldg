package ldg.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentDynamicSqlService;

@SuppressWarnings("serial")
public class CommentDynamicSqlSelectServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long commentNo = Long.parseLong(req.getParameter("commentNo"));
		String userId = req.getParameter("userId");
		
		CommentDynamicSqlService commentService = new CommentDynamicSqlService();
		List<Comment> comments = commentService.selectComment(commentNo, userId);
		
		req.setAttribute("result", comments);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
