package ldg.mybatis.repository;

import java.util.List;
import java.util.Map;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.mapper.CommentMapper;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentMapperRepository extends AbstractRepository {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommentMapperRepository.class);
	
	public Comment selectCommentByPrimaryKey(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Comment result = null;
		try {
			result = sqlSession.getMapper(CommentMapper.class).selectCommentByPrimaryKey(commentNo);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public List<Comment> selectCommentByCondition(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Comment> result = null;
		try {
			result = sqlSession.getMapper(CommentMapper.class).selectCommentByCondition(condition);
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public Integer insertComment(Comment comment) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Integer result = null;
		try {
			result = sqlSession.getMapper(CommentMapper.class).insertComment(comment);
			if( result > 0 ){
				sqlSession.commit();
			}
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public Integer deleteComment(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Integer result = null;
		try {
			result = sqlSession.getMapper(CommentMapper.class).deleteComment(commentNo);
			if( result > 0 ){
				sqlSession.commit();
			}
		} catch (Exception e) {
			LOGGER.warn("{} : {}", e.getMessage(), e);
		} finally {
			sqlSession.close();
		}
		return result;
	}
}