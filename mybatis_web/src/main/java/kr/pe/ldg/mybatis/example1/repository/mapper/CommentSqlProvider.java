package kr.pe.ldg.mybatis.example1.repository.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import kr.pe.ldg.mybatis.example1.model.Comment;

public class CommentSqlProvider {
	public String selectCommentByCondition(Comment comment) {
		BEGIN();
		SELECT("comment_no");
		SELECT("user_id");
		SELECT("comment_content");
		SELECT("reg_date");
		FROM("comment");
		WHERE("comment_no = #{commentNo}");

		return SQL();
	}
}
