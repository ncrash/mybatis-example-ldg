package ldg.mybatis.service;

import java.util.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentMapperRepository;

public class CommentMapperService {
	private CommentMapperRepository commentRepository = new CommentMapperRepository();
	
	public Comment selectCommentByPrimaryKey(Long commentNo){
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}
	public List<Comment> selectCommentByCondition(Map<String, Object> condition){
		return commentRepository.selectCommentByCondition(condition);
	}
	
	public Integer insertComment(Comment comment) {
		return commentRepository.insertComment(comment);
	}

	public Integer deleteComment(Long commentNo) {
		return commentRepository.deleteComment(commentNo);
	}
}