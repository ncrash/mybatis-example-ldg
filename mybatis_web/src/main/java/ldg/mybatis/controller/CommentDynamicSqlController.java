package ldg.mybatis.controller;

import java.util.List;

import ldg.mybatis.model.Comment;
import ldg.mybatis.service.CommentDynamicSqlService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/comment")
public class CommentDynamicSqlController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentDynamicSqlController.class);

	@RequestMapping(value = "/select.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView select(Long commentNo, String userId) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentDynamicSqlService commentService = new CommentDynamicSqlService();
			List<Comment> comments = commentService.selectComment(commentNo, userId);
			mav.addObject("message", comments);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}
	
	@RequestMapping(value = "/foreach.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView foreach(Long[] commentNos) {
		ModelAndView mav = new ModelAndView();
		
		try {
			CommentDynamicSqlService commentService = new CommentDynamicSqlService();
			List<Comment> comments = commentService.selectCommentForeach(commentNos);
			mav.addObject("message", comments);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}
}
