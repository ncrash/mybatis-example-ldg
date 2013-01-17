package ldg.mybatis.repository.session;

import java.util.*;

import ldg.mybatis.model.Comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommentSessionRepositoryTest {
	private static final Long commentNo = 1L;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CommentSessionRepository commentSessionRepository = (CommentSessionRepository)context.getBean("commentSessionRepository");

		commentSessionRepository.selectCommentByPrimaryKey(commentNo);

		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		commentSessionRepository.selectCommentByCondition(condition);

		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentSessionRepository.deleteComment(commentNo);
		commentSessionRepository.insertComment(comment);

		commentSessionRepository.deleteComment(commentNo);
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
