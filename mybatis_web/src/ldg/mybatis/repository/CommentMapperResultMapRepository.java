package ldg.mybatis.repository;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;
import ldg.mybatis.repository.mapper.CommentMapperResultMap;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentMapperResultMapRepository extends AbstractRepository {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentMapperResultMapRepository.class);

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Comment result = null;
		try {
			result = sqlSession.getMapper(CommentMapperResultMap.class).selectCommentByPrimaryKey(commentNo);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public Comment selectCommentByPrimaryKeyConstructor2(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Comment result = null;
		try {
			result = sqlSession.getMapper(CommentMapperResultMap.class).selectCommentByPrimaryKeyConstructor2(commentNo);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public CommentUser selectCommentByPrimaryKeyAssociation2(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		CommentUser result = null;
		try {
			result = sqlSession.getMapper(CommentMapperResultMap.class).selectCommentByPrimaryKeyAssociation2(commentNo);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

//	public Comment selectCommentByPrimaryKeyCollection2(Long commentNo) {
//		SqlSession sqlSession = getSqlSessionFactory().openSession();
//		Comment result = null;
//		try {
//			result = sqlSession.getMapper(CommentMapperResultMap.class).selectCommentByPrimaryKeyCollection2(commentNo);
//		} catch (Exception e) {
//			LOGGER.warn("{} : {}", e.getMessage(), e);
//		} finally {
//			sqlSession.close();
//		}
//		return result;
//	}

	public Comment selectCommentByPrimaryKeyDiscriminator2(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Comment result = null;
		try {
			result = sqlSession.getMapper(CommentMapperResultMap.class).selectCommentByPrimaryKeyDiscriminator2(
				commentNo);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}
}