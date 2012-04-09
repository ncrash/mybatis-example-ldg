package kr.pe.ldg.mybatis.example1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.repository.CommentSessionRepository;

public class CommentService {
	public Comment selectByPrimaryKey(Long commentNo) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}
	
	public List<Comment> selectComment(Long commentNo) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);

		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.selectCommentByCondition(condition);
	}

	public Integer insertComment(Comment comment) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.insertComment(comment);
	}

	public Integer deleteComment(Long commentNo) {
		CommentSessionRepository commentRepository = new CommentSessionRepository();
		return commentRepository.deleteComment(commentNo);
	}
}