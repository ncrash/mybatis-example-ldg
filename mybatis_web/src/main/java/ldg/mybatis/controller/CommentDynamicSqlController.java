package ldg.mybatis.controller;


//@Controller
//@RequestMapping(value = "/comment")
public class CommentDynamicSqlController {
	/*
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
	*/
}
