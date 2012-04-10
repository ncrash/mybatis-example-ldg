package kr.pe.ldg.mybatis.example1.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.model.User;
import kr.pe.ldg.mybatis.example1.repository.CommentSessionRepository;

public class CommentService {
	public Comment selectByPrimaryKey(Long commentNo) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}

	public List<Comment> selectComment(Long commentNo, String userId) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);
		User user = new User();
		user.setUserId(userId);
		condition.put("user", user);

		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.selectCommentByConditionTrim(condition);
	}

	public List<Comment> selectCommentForeach(Long[] commentNos) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNos", Arrays.asList(commentNos));

		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.selectCommentByConditionForeach(condition);
	}

	public Integer insertComment(Comment comment) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.insertComment(comment);
	}

	public Integer updateComment(Comment comment) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.updateCommentTrim(comment);
	}

	public Integer deleteComment(Long commentNo) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.deleteComment(commentNo);
	}
}