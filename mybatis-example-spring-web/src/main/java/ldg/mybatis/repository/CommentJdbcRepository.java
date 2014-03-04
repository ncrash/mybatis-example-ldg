package ldg.mybatis.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import ldg.mybatis.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

@Repository
public class CommentJdbcRepository {
	protected NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public Comment selectCommentByPrimaryKey(Long commentNo) {
		Assert.notNull(commentNo, "댓글번호가 없습니다.");

		StringBuilder sql = new StringBuilder("");
		sql.append("SELECT comment_no, user_id, comment_content, reg_date FROM COMMENT WHERE comment_no = :commentNo ");

		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);
		SqlParameterSource namedParameters = new MapSqlParameterSource(condition);
		RowMapper<Comment> rowMapper = ParameterizedBeanPropertyRowMapper.newInstance(Comment.class);
		List<Comment> result = this.jdbcTemplate.query(sql.toString(), namedParameters, rowMapper);

		if (!CollectionUtils.isEmpty(result)) {
			return result.get(0);
		}
		return null;
	}

	public Integer insertComment(Comment comment) {
		Assert.notNull(comment, "댓글 데이터가 없습니다.");

		StringBuilder sql = new StringBuilder("");
		sql.append("INSERT INTO COMMENT(comment_no, user_id, comment_content, reg_date) ");
		sql.append("VALUES (:commentNo, :userId, :commentContent, :regDate) ");

		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(comment);
		return this.jdbcTemplate.update(sql.toString(), namedParameters);
	}

	public Integer deleteComment(Long commentNo) {
		Assert.notNull(commentNo, "댓글번호가 없습니다.");

		StringBuilder sql = new StringBuilder("");
		sql.append("DELETE FROM comment WHERE comment_no = :commentNo ");

		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);
		SqlParameterSource namedParameters = new MapSqlParameterSource(condition);
		return this.jdbcTemplate.update(sql.toString(), namedParameters);
	}
}