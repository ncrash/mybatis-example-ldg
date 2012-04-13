package kr.pe.ldg.mybatis.example1.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.model.User;
import kr.pe.ldg.mybatis.example1.repository.CommentSessionDynamicSqlRepository;

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

	public List<Comment> selectCommentForeach(Long[] commentNos) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNos", Arrays.asList(commentNos));

		CommentSessionDynamicSqlRepository commentRepository = new CommentSessionDynamicSqlRepository();
		return commentRepository.selectCommentByConditionForeach(condition);
	}
}