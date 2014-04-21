package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.Comment;

public class CommentSessionRepositoryTest {
	private final CommentSessionRepository commentSessionRepository = new CommentSessionRepository();

	public static void main(String[] args) {
		CommentSessionRepositoryTest test = new CommentSessionRepositoryTest();

		test.testUpdateCommentIf();
		test.testUpdateCommentTrim();
		test.testInsertComment();
		test.testDeleteComment();
	}

	public void testUpdateCommentIf() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.updateCommentIf(comment);
	}

	public void testUpdateCommentTrim() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.updateCommentTrim(comment);
	}

	public void testInsertComment() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.deleteComment(1L);
		commentSessionRepository.insertComment(comment);
	}

	public void testDeleteComment() {
		commentSessionRepository.deleteComment(1L);
	}

	private Comment makeComment(Long commentNo, String userId, String commentContent, Date regDate) {
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		return comment;
	}
}