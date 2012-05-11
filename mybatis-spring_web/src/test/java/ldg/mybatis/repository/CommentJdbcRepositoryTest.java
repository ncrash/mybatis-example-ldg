package ldg.mybatis.repository;

import java.util.Calendar;
import java.util.Date;

import ldg.mybatis.model.Comment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class CommentJdbcRepositoryTest {
	@Autowired
	private CommentJdbcRepository commentJdbcRepository;

	private final Long commentNo = 1L;

	@Test
	public void testSelectCommentByPrimaryKey() {
		commentJdbcRepository.selectCommentByPrimaryKey(commentNo);
	}

	@Test
	public void testInsertComment() {
		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentJdbcRepository.deleteComment(commentNo);
		commentJdbcRepository.insertComment(comment);
	}

	@Test
	public void testDeleteComment() {
		commentJdbcRepository.deleteComment(commentNo);
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
