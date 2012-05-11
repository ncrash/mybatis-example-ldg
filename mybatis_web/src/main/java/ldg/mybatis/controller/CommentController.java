package ldg.mybatis.controller;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentService;

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

	@RequestMapping(value = "/insert.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView insert(Comment comment) {
		ModelAndView mav = new ModelAndView();

		try {
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
	
	@RequestMapping(value = "/update.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView update(Comment comment) {
		ModelAndView mav = new ModelAndView();
		
		try {
			CommentService commentService = new CommentService();
			Integer result = commentService.updateComment(comment);
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
