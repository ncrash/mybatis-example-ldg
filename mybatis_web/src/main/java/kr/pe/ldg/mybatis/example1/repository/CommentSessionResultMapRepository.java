package kr.pe.ldg.mybatis.example1.repository;

import kr.pe.ldg.mybatis.example1.model.Comment;
import kr.pe.ldg.mybatis.example1.model.CommentUser;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionResultMapRepository extends AbstractRepository {
	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_ResultMap.selectCommentByPrimaryKey";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_ResultMap.selectCommentByPrimaryKeyConstructor";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_ResultMap.selectCommentByPrimaryKeyAssociation";
			return (CommentUser)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public Comment selectCommentByPrimaryKeyCollection(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_ResultMap.selectCommentByPrimaryKeyCollection";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = "kr.pe.ldg.mybatis.example1.repository.mapper.CommentMapper_ResultMap.selectCommentByPrimaryKeyDiscriminator";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
}
