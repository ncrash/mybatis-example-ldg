package kr.pe.ldg.mybatis.example1.service;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.repository.CommentSessionRepository;

public class CommentService {
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