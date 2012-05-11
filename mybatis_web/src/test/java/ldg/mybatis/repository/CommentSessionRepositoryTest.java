package ldg.mybatis.repository;

import java.util.Calendar;
import java.util.Date;

import ldg.mybatis.model.Comment;

import org.junit.Test;

public class CommentSessionRepositoryTest {
	private final CommentSessionRepository commentSessionRepository = new CommentSessionRepository();

	@Test
	public void testUpdateCommentIf() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.updateCommentIf(comment);
	}

	@Test
	public void testUpdateCommentTrim() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.updateCommentTrim(comment);
	}

	@Test
	public void testInsertComment() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.deleteComment(1L);
		commentSessionRepository.insertComment(comment);
	}

	@Test
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
