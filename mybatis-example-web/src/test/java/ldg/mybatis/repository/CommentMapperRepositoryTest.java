package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.*;
import ldg.mybatis.repository.CommentMapperRepository;

public class CommentMapperRepositoryTest {
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();
	private static final Long commentNo = 1L;

	public static void main(String[] args) {
		CommentMapperRepositoryTest test = new CommentMapperRepositoryTest();

		test.testSelectCommentByPrimaryKey();
		test.testSelectCommentByCondition();
		test.testDeleteComment();
		test.testInsertComment();
		test.testDeleteComment();
	}

	public void testSelectCommentByPrimaryKey() {
		Comment comment = commentMapperRepository.selectCommentByPrimaryKey(commentNo);
		System.out.println(comment);
	}

	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentMapperRepository.selectCommentByCondition(condition);
	}

	public void testInsertComment() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);
	}

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
