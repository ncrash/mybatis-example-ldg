package ldg.mybatis.repository.mapper;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CommentSqlProvider {
	
    public String selectCommentByCondition(final Map<String, Object> condition) {
        return new SQL() {{
            SELECT("comment_no, user_id, comment_content, reg_date");
            FROM("comment");
            WHERE("comment_no = #{commentNo}");
        }}.toString();
	}
}