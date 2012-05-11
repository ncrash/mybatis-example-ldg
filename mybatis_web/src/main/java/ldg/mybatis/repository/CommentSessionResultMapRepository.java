package ldg.mybatis.repository;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionResultMapRepository extends AbstractRepository {
	private final String namespace = "ldg.mybatis.repository.mapper.CommentMapper_ResultMap";

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKey";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyConstructor";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyAssociation";
			return (CommentUser)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public Comment selectCommentByPrimaryKeyCollection(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyCollection";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyDiscriminator";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
}