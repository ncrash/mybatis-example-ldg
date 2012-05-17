package ldg.mybatis.repository.mapper;

import ldg.mybatis.model.Comment;

public interface CommentMapperResultMap {
	//	@Select("SELECT comment_no, user_id, comment_content, reg_date FROM COMMENT WHERE comment_no = #{commentNo}")
	Comment selectCommentByPrimaryKey(Long commentNo);
}