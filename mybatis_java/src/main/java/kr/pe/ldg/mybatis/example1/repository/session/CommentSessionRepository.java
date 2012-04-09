package kr.pe.ldg.mybatis.example1.repository.session;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CommentSessionRepository {
	private SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			return (Comment)sqlSession.selectOne(
				"kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.selectCommentByPrimaryKey", commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList(
				"kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.selectCommentByCondition", condition);
		} finally {
			sqlSession.close();
		}
	}

	public Integer insertComment(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.insertComment";
			int result = sqlSession.insert(statement, comment);
			if (result > 0) {
				sqlSession.commit();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateComment(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.updateComment";
			int result = sqlSession.update(statement, comment);
			if (result > 0) {
				sqlSession.commit();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}

	public Integer deleteComment(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.deleteComment";
			int result = sqlSession.delete(statement, commentNo);
			if (result > 0) {
				sqlSession.commit();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}
}
