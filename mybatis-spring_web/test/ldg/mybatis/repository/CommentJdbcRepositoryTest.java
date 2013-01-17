package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.Comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommentJdbcRepositoryTest {
	private static final Long commentNo = 1L;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CommentJdbcRepository commentJdbcRepository = (CommentJdbcRepository)context.getBean("commentJdbcRepository");

		commentJdbcRepository.selectCommentByPrimaryKey(commentNo);

		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentJdbcRepository.deleteComment(commentNo);
		commentJdbcRepository.insertComment(comment);

		commentJdbcRepository.deleteComment(commentNo);
	}

	private static Comment makeComment(Long commentNo, String userId, String commentContent, Date regDate) {
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		return comment;
	}
}
