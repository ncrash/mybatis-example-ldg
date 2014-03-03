package ldg.mybatis.service;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionRepository;

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