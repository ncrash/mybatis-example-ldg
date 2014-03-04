package ldg.mybatis.service;

import ldg.mybatis.model.*;
import ldg.mybatis.repository.CommentMapperResultMapRepository;

public class CommentMapperResultMapService {
	private CommentMapperResultMapRepository commentRepository = new CommentMapperResultMapRepository();
	
	public Comment selectCommentByPrimaryKey(Long commentNo){
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}
	
	public Comment selectCommentByPrimaryKeyConstructor2(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyConstructor2(commentNo);
	}
	
	public CommentUser selectCommentByPrimaryKeyAssociation2(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyAssociation2(commentNo);
	}
	
//	public Comment selectCommentByPrimaryKeyCollection2(Long commentNo){
//		return commentRepository.selectCommentByPrimaryKeyCollection2(commentNo);
//	}
	
	public Comment selectCommentByPrimaryKeyDiscriminator2(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo);
	}	
}