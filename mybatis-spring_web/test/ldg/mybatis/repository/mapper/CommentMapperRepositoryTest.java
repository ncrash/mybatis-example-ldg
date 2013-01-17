package ldg.mybatis.repository.mapper;

import java.util.*;

import ldg.mybatis.model.Comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommentMapperRepositoryTest {
	private static final Long commentNo = 1L;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CommentMapperRepository commentMapperRepository = (CommentMapperRepository)context.getBean("commentMapperRepository");

		commentMapperRepository.selectCommentByPrimaryKey(commentNo);

		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		commentMapperRepository.selectCommentByCondition(condition);

		Comment comment = makeComment(1L, "fromm0", "", Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);

		commentMapperRepository.deleteComment(commentNo);
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
