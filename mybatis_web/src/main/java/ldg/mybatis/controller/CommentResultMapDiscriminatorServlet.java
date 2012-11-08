package ldg.mybatis.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentResultMapService;

@SuppressWarnings("serial")
public class CommentResultMapDiscriminatorServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long commentNo = Long.parseLong(req.getParameter("commentNo"));

		CommentResultMapService commentService = new CommentResultMapService();
		Comment comment = commentService.selectCommentByPrimaryKeyDiscriminator(commentNo);

		req.setAttribute("result", comment);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
