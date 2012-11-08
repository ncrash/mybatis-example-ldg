package ldg.mybatis.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import ldg.mybatis.service.CommentService;

@SuppressWarnings("serial")
public class CommentDeleteServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long commentNo = Long.parseLong(req.getParameter("commentNo"));
		
		CommentService commentService = new CommentService();
		Integer result = commentService.deleteComment(commentNo);
		
		req.setAttribute("result", result);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
