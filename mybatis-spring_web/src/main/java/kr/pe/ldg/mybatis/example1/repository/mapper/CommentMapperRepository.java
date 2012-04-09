package kr.pe.ldg.mybatis.example1.repository.mapper;

import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentMapperRepository {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		return sqlSession.getMapper(CommentMapper.class).selectCommentByPrimaryKey(commentNo);
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		return sqlSession.getMapper(CommentMapper.class).selectCommentByCondition(condition);
	}
	
	public Integer insertComment(Comment comment) {
		Integer result = sqlSession.getMapper(CommentMapper.class).insertComment(comment);
		return result;
	}

	public Integer deleteComment(Long commentNo) {
		Integer result = sqlSession.getMapper(CommentMapper.class).deleteComment(commentNo);
		return result;
	}
}