package kr.pe.ldg.mybatis.example1.repository.session;

import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentSessionRepository {
	@Autowired
	private SqlSessionTemplate sqlSession;

	private final String namespace = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper";

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		return (Comment)sqlSession.selectOne(String.format("%s.selectCommentByPrimaryKey", namespace), commentNo);
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		return sqlSession.selectList(String.format("%s.selectCommentByCondition", namespace), condition);
	}

	public Integer insertComment(Comment comment) {
		int result = sqlSession.insert(String.format("%s.insertComment", namespace), comment);
		return result;
	}

	public Integer deleteComment(Long commentNo) {
		int result = sqlSession.delete(String.format("%s.Comment.deleteComment", namespace), commentNo);
		return result;
	}
}
