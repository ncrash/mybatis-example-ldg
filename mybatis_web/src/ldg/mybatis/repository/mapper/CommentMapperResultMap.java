package ldg.mybatis.repository.mapper;

import java.util.Date;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.Case;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.TypeDiscriminator;
import org.apache.ibatis.type.JdbcType;

public interface CommentMapperResultMap {
	//	@Select("SELECT comment_no, user_id, comment_content, reg_date FROM COMMENT WHERE comment_no = #{commentNo}")
	Comment selectCommentByPrimaryKey(Long commentNo);

	@Select({"SELECT comment_no, user_id, comment_content, reg_date ", 
			"FROM comment ", 
			"WHERE comment_no = #{commentNo} "})
	@ConstructorArgs({@Arg(column = "comment_no", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
		@Arg(column = "user_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
		@Arg(column = "reg_date", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
		@Arg(column = "comment_content", javaType = String.class, jdbcType = JdbcType.LONGVARCHAR)})
	Comment selectCommentByPrimaryKeyConstructor2(Long commentNo);

	/**
	 * 자바 애노테이션은 순환참조를 허용하지 않기 때문에 매퍼 XML의 association엘리먼트와 같은 결과매핑을 처리하기 어렵다. 
	 * "객체타입필드명.필드명" 형태의 프로퍼티 셋팅으로 비슷한 처리를 하도록 할 수 있다.  
	 * 
	 * @param commentNo
	 * @return
	 */
	@Select({"SELECT c.comment_no, c.user_id, c.comment_content, c.reg_date, u.user_name ", 
			"FROM comment c, user u ", 
			"WHERE c.user_id = u.user_id ", 
			"AND c.comment_no = #{commentNo}  "})
	@Results({
		@Result(column="comment_no", property="comment.commentNo", id=true),
		@Result(column="user_id", property="comment.userId"),
        @Result(column="reg_date", property="comment.regDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="comment_content", property="comment.commentContent"),
		@Result(column="user_id", property="user.userId"),
		@Result(column="user_name", property="user.userName")
    })
	CommentUser selectCommentByPrimaryKeyAssociation2(Long commentNo);

	/**
	 * 자바 애노테이션은 순환참조를 허용하지 않기 때문에 매퍼 XML의 collection엘리먼트와 같은 결과매핑을 처리할수가 없다. 
	 * 복잡한 결과매핑은 매퍼 XML을 사용해서 정의해야 한다. 
	 * 
	 * @param commentNo
	 * @return
	 */
//	@Select({"SELECT c.comment_no, c.user_id, c.comment_content, c.reg_date, r.reply_content, r.reg_date AS reg_date2 ",
//		"FROM comment c, reply r ", 
//		"WHERE c.comment_no = r.comment_no ",
//		"AND c.comment_no = #{commentNo} "})
//	@Results({
//		@Result(column="comment_no", property="commentNo", id=true),
//		@Result(column="user_id", property="userId"),
//	    @Result(column="reg_date", property="regDate", jdbcType=JdbcType.TIMESTAMP),
//	    @Result(column="comment_content", property="commentContent"),
//		@Result(column="reply_content", property="reply.replyContent"),
//		@Result(column="reg_date2", property="reply.regDate")
//	})
//	Comment selectCommentByPrimaryKeyCollection2(Long commentNo);

	/**
	 * 
	 * 	
	 * <discriminator javaType="string" column="user_id">
	 * <case value="fromm0" resultMap="baseResultMap" />
	 * <case value="manager" resultMap="constructorResultMap" />
	 * </discriminator>
	 * 
	 * @param commentNo
	 * @return
	 */
	@Select({"SELECT comment_no, user_id, comment_content, reg_date ", 
		"FROM comment ", 
		"WHERE comment_no = #{commentNo} "})
//	@Results({
//		@Result(column="comment_no", property="commentNo", id=true),
//		@Result(column="user_id", property="userId"),
//	    @Result(column="reg_date", property="regDate", jdbcType=JdbcType.TIMESTAMP),
//	    @Result(column="comment_content", property="commentContent"),
//	})
	@TypeDiscriminator(column="user_id", javaType=String.class, cases={
		@Case(value="fromm0", type=Comment.class, results={
			@Result(column="comment_no", property="commentNo", id=true),
			@Result(column="user_id", property="userId"),
			@Result(column="reg_date", property="regDate", jdbcType=JdbcType.TIMESTAMP),
			@Result(column="comment_content", property="commentContent")}),
		@Case(value="manager", type=Comment.class, constructArgs={
			@Arg(column = "comment_no", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
			@Arg(column = "user_id", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "reg_date", javaType = Date.class, jdbcType = JdbcType.TIMESTAMP),
			@Arg(column = "comment_content", javaType = String.class, jdbcType = JdbcType.LONGVARCHAR)})
	})
	Comment selectCommentByPrimaryKeyDiscriminator2(Long commentNo);
}