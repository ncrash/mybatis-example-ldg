package ldg.mybatis.repository.mapper;

import java.util.List;
import java.util.Map;

import ldg.mybatis.model.Comment;

import org.apache.ibatis.annotations.Select;

public interface CommentMapper {
	@Select("SELECT comment_no, user_id, comment_content, reg_date FROM COMMENT WHERE comment_no = #{commentNo}")
	Comment selectCommentByPrimaryKey(Long commentNo);

	//	@Select("SELECT comment_no, user_id, comment_content, reg_date FROM COMMENT WHERE comment_no = #{commentNo}")
	List<Comment> selectCommentByCondition(Map<String, Object> condition);

	//	@Insert("INSERT INTO COMMENT(comment_no, user_id, comment_content, reg_date) VALUES (#{commentNo}, #{userId}, #{commentContent}, #{regDate})")
	Integer insertComment(Comment comment);

	//	@Delete("DELETE FROM comment WHERE comment_no = #{commentNo}")
	Integer deleteComment(Long commentNo);
}
