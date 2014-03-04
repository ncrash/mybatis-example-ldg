package ldg.mybatis.service;

import java.util.*;

import ldg.mybatis.model.*;
import ldg.mybatis.repository.CommentSessionDynamicSqlRepository;

public class CommentDynamicSqlService {
	public List<Comment> selectComment(Long commentNo, String userId) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);
		User user = new User();
		user.setUserId(userId);
		condition.put("user", user);

		CommentSessionDynamicSqlRepository commentRepository = new CommentSessionDynamicSqlRepository();
		return commentRepository.selectCommentByConditionTrim(condition);
	}

	public List<Comment> selectCommentForeach(String[] commentNos) {
		Map<String, Object> condition = new HashMap<String, Object>();
		List<Long> cs = new ArrayList<Long>();
		for (String commentNo : commentNos) {
			cs.add(Long.parseLong(commentNo));
		}
		condition.put("commentNos", cs);

		CommentSessionDynamicSqlRepository commentRepository = new CommentSessionDynamicSqlRepository();
		return commentRepository.selectCommentByConditionForeach(condition);
	}
}