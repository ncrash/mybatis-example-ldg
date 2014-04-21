package ldg.mybatis.repository.session;

import java.util.*;

import ldg.mybatis.model.Comment;

public class CommentSessionRepositoryTest {
	private final CommentSessionRepository commentSessionRepository = new CommentSessionRepository();

	public void testSelectCommentByPrimaryKey() {
		Long commentNo = 1L;
		Comment comment = commentSessionRepository.selectCommentByPrimaryKey(commentNo);

		System.out.println(comment);
	}

	public void testInsertComment() {
		Long commentNo = 1L;
		String userId = "fromm0";
		Date regDate = Calendar.getInstance().getTime();
		String commentContent = "test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		// 지우고 
		//		commentSessionRepository.deleteComment(commentNo);
		// 입력한다.
		Integer result = commentSessionRepository.insertComment(comment);

		System.out.println(result);
	}

	public void testUpdateComment() {
		Long commentNo = 1L;
		String commentContent = "수정 test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setCommentContent(commentContent);
		Integer result = commentSessionRepository.updateComment(comment);

		System.out.println(result);
	}

	public void testDeleteComment() {
		Long commentNo = 1L;
		Integer result = commentSessionRepository.deleteComment(commentNo);

		System.out.println(result);
	}

	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 2L);
		//		condition.put("commentNoForeach", Arrays.asList(1L, 2L, 3L));
		condition.put("commentNoForeach", new ArrayList<Long>());
		commentSessionRepository.selectCommentByCondition(condition);
	}

	public static void main(String[] args) {
		CommentSessionRepositoryTest test = new CommentSessionRepositoryTest();

		test.testSelectCommentByPrimaryKey();
		test.testInsertComment();
		test.testUpdateComment();
		test.testDeleteComment();
		test.testSelectCommentByCondition();
	}
}
