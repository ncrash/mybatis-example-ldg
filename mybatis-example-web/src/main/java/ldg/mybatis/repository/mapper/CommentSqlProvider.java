package ldg.mybatis.repository.mapper;

// import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
// import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
// import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
// import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
// import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.Map;

public class CommentSqlProvider {
	
	// TODO 컴파일 에러 발생한 문제 원인 파악 및 주석처리 제거
	public String selectCommentByCondition(Map<String, Object> condition) {
		// BEGIN();
		// SELECT("comment_no, user_id, comment_content, reg_date");
		// FROM("comment");
		// WHERE("comment_no = #{commentNo}");
        // 
		// return SQL();
		return null;
	}
}
