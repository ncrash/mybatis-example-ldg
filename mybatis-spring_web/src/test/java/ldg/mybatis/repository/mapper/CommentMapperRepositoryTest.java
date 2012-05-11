package ldg.mybatis.repository.mapper;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ldg.mybatis.model.Comment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class CommentMapperRepositoryTest {
	@Autowired
	private CommentMapperRepository commentMapperRepository;

	private final Long commentNo = 1L;

	@Test
	public void testSelectCommentByPrimaryKey() {
		commentMapperRepository.selectCommentByPrimaryKey(commentNo);
	}

	@Test
	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);

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
}
