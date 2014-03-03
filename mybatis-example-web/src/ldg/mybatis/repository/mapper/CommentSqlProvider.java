package ldg.mybatis.repository.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.Map;

public class CommentSqlProvider {
	public String selectCommentByCondition(Map<String, Object> condition) {
		BEGIN();
		SELECT("comment_no, user_id, comment_content, reg_date");
		FROM("comment");
		WHERE("comment_no = #{commentNo}");

		return SQL();
	}
}
