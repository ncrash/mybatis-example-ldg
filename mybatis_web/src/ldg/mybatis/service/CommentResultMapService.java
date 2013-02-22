package ldg.mybatis.service;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentResultMapService {
	private CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
	
	public Comment selectByPrimaryKey(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}

	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyConstructor(commentNo);
	}

	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyAssociation(commentNo);
	}

	public Comment selectCommentByPrimaryKeyCollection(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
	}
	
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
	}
}