package kr.pe.ldg.mybatis.example1.repository;

import java.util.List;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionRepository extends AbstractRepository {
	private final String namespace = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper";

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByPrimaryKey", this.namespace);
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByCondition", this.namespace);
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionIf(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByConditionIf", this.namespace);
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public List<Comment> selectCommentByConditionChoose(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByConditionChoose", this.namespace);
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<Comment> selectCommentByConditionTrim(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByConditionTrim", this.namespace);
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<Comment> selectCommentByConditionForeach(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.selectCommentByConditionForeach", this.namespace);
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}

	public Integer updateCommentIf(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.updateCommentIf", this.namespace);
			int result = sqlSession.insert(statement, comment);
			if (result > 0) {
				sqlSession.commit();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}
	
	public Integer updateCommentTrim(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.updateCommentTrim", this.namespace);
			int result = sqlSession.insert(statement, comment);
			if (result > 0) {
				sqlSession.commit();
			}
			return result;
		} finally {
			sqlSession.close();
		}
	}
	
	public Integer insertComment(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = String.format("%s.insertComment", this.namespace);
			int result = sqlSession.insert(statement, comment);
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
			String statement = String.format("%s.deleteComment", this.namespace);
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
