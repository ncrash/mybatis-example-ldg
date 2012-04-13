package kr.pe.ldg.mybatis.example1.repository;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionRepository extends AbstractRepository {
	public Integer updateCommentIf(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.updateCommentIf";
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
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper.updateCommentTrim";
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
