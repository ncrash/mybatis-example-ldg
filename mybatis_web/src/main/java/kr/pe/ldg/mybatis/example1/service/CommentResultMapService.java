package kr.pe.ldg.mybatis.example1.service;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.model.CommentUser;
import kr.pe.ldg.mybatis.example1.repository.CommentSessionResultMapRepository;

public class CommentResultMapService {
	public Comment selectByPrimaryKey(Long commentNo) {
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}

	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		return commentRepository.selectCommentByPrimaryKeyConstructor(commentNo);
	}

	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		return commentRepository.selectCommentByPrimaryKeyAssociation(commentNo);
	}

	public Comment selectCommentByPrimaryKeyCollection(Long commentNo) {
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		return commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
	}
	
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		return commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
	}
}