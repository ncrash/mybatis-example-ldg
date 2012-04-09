package kr.pe.ldg.mybatis.example1.repository;

import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper;

import org.apache.ibatis.session.SqlSession;

public class CommentMapperRepository extends AbstractRepository {
	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		return sqlSession.getMapper(CommentMapper.class).selectCommentByPrimaryKey(commentNo);
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		return sqlSession.getMapper(CommentMapper.class).selectCommentByCondition(condition);
	}
	
	public Integer insertComment(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Integer result = sqlSession.getMapper(CommentMapper.class).insertComment(comment);
		return result;
	}

	public Integer deleteComment(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Integer result = sqlSession.getMapper(CommentMapper.class).deleteComment(commentNo);
		return result;
	}
}