package ldg.mybatis.controller;


//@Controller
//@RequestMapping(value = "/comment")
public class CommentResultMapController {
	/*
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
	*/
}
