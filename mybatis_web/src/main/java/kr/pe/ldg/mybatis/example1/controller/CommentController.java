package kr.pe.ldg.mybatis.example1.controller;

import java.util.Calendar;
import java.util.List;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.service.CommentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/comment")
public class CommentController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

	@RequestMapping(value = "/one.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView one(Long commentNo) {
		ModelAndView mav = new ModelAndView();
		
		try {
			CommentService commentService = new CommentService();
			Comment comment = commentService.selectByPrimaryKey(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}
	
	@RequestMapping(value = "/select.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView select(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentService commentService = new CommentService();
			List<Comment> comments = commentService.selectComment(commentNo);
			mav.addObject("message", comments);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/insert.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView insert(Comment comment) {
		ModelAndView mav = new ModelAndView();

		try {
			comment.setRegDate(Calendar.getInstance().getTime());
			CommentService commentService = new CommentService();
			Integer result = commentService.insertComment(comment);
			if (result > 0) {
				mav.addObject("message", "success");
			} else {
				mav.addObject("message", "fail");
			}
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
			mav.addObject("message", e.getMessage());
		}
		return mav;
	}

	@RequestMapping(value = "/delete.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView delete(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentService commentService = new CommentService();
			Integer result = commentService.deleteComment(commentNo);
			if (result > 0) {
				mav.addObject("message", "success");
			} else {
				mav.addObject("message", "fail");
			}
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
			mav.addObject("message", e.getMessage());
		}
		return mav;
	}
}
