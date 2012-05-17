package ldg.mybatis.repository;

import ldg.mybatis.model.Comment;
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
}