package kr.pe.ldg.mybatis.example1.controller;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.model.CommentUser;
import kr.pe.ldg.mybatis.example1.service.CommentResultMapService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/comment")
public class CommentResultMapController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentResultMapController.class);

	@RequestMapping(value = "/one.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView one(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentResultMapService commentService = new CommentResultMapService();
			Comment comment = commentService.selectByPrimaryKey(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/constructor.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView constructor(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentResultMapService commentService = new CommentResultMapService();
			Comment comment = commentService.selectCommentByPrimaryKeyConstructor(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/association.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView association(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentResultMapService commentService = new CommentResultMapService();
			CommentUser comment = commentService.selectCommentByPrimaryKeyAssociation(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/collection.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView collection(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentResultMapService commentService = new CommentResultMapService();
			Comment comment = commentService.selectCommentByPrimaryKeyCollection(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/discriminator.*", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView discriminator(Long commentNo) {
		ModelAndView mav = new ModelAndView();

		try {
			CommentResultMapService commentService = new CommentResultMapService();
			Comment comment = commentService.selectCommentByPrimaryKeyDiscriminator(commentNo);
			mav.addObject("message", comment);
		} catch (Exception e) {
			LOGGER.error("{}", e.getMessage(), e);
		}
		return mav;
	}
}
