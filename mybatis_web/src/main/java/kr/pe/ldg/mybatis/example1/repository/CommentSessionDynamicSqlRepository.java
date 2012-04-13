package kr.pe.ldg.mybatis.example1.repository;

import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionDynamicSqlRepository extends AbstractRepository {
	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_Dynamic.selectCommentByCondition";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionIf(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_Dynamic.selectCommentByConditionIf";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionChoose(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_Dynamic.selectCommentByConditionChoose";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionTrim(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_Dynamic.selectCommentByConditionTrim";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionForeach(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_Dynamic.selectCommentByConditionForeach";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}
}
