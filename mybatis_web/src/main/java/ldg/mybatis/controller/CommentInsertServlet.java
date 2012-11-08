package ldg.mybatis.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentService;

import org.apache.commons.lang.time.DateUtils;

@SuppressWarnings("serial")
public class CommentInsertServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long commentNo = Long.parseLong(req.getParameter("commentNo"));
		String userId = req.getParameter("userId");
		Date regDate = null;
		try {
			regDate = DateUtils.parseDateStrictly(req.getParameter("regDate"), new String[]{"yyyy-MM-dd HH:mm:ss"});
		} catch (ParseException e) {
			throw new IllegalArgumentException(e);
		}
		String commentContent = req.getParameter("commentContent");
		Comment comment = new Comment(commentNo, userId, regDate, commentContent);
		
		CommentService commentService = new CommentService();
		Integer result = commentService.insertComment(comment);
		
		req.setAttribute("result", result);
		RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
		dispatcher.forward(req, resp);
	}
}
