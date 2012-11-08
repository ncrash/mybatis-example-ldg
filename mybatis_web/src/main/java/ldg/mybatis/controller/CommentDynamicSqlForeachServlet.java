package ldg.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentDynamicSqlService;

@SuppressWarnings("serial")
public class CommentDynamicSqlForeachServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] commentNos = req.getParameterValues("commentNos");
		
		CommentDynamicSqlService commentService = new CommentDynamicSqlService();
		List<Comment> comments = commentService.selectCommentForeach(commentNos);
		
		req.setAttribute("result", comments);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
