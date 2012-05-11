package ldg.mybatis.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.User;

import org.junit.Test;

public class CommentMapperRepositoryTest {
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;
	
	@Test
	public void testSelectCommentByPrimaryKey() {
		commentMapperRepository.selectCommentByPrimaryKey(commentNo);
	}

	@Test
	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());
		
		commentMapperRepository.selectCommentByCondition(condition);
	}

	@Test
	public void testInsertComment() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);
	}

	@Test
	public void testDeleteComment() {
		commentMapperRepository.deleteComment(commentNo);
	}

	private Comment makeComment(Long commentNo, String userId, String commentContent, Date regDate) {
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		return comment;
	}
	
	private User makeUser() {
		User user = new User();
		user.setUserId("fromm0");
		user.setUserName("이동국");
		return user;
	}
}
