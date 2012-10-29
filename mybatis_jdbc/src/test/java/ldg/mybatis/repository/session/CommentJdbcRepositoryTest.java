package ldg.mybatis.repository.session;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import ldg.mybatis.model.Comment;

import org.junit.Test;

@SuppressWarnings("unused")
public class CommentJdbcRepositoryTest {
	private final CommentJdbcRepository commentJdbcRepository = new CommentJdbcRepository();

	@Test
	public void testSelectCommentByPrimaryKey() {
		Long commentNo = 1L;
		Comment comment = commentJdbcRepository.selectCommentByPrimaryKey(commentNo);

		//		assertNotNull(comment);
	}

	@Test
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
		commentJdbcRepository.deleteComment(commentNo);
		// 입력한다.
		Integer result = commentJdbcRepository.insertComment(comment);

		//		assertSame(result, 1);
	}

	@Test
	public void testUpdateComment() {
		Long commentNo = 1L;
		String commentContent = "test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setCommentContent(commentContent);
		Integer result = commentJdbcRepository.updateComment(comment);

		//		assertSame(result, 1);
	}

	@Test
	public void testDeleteComment() {
		Long commentNo = 1L;
		Integer result = commentJdbcRepository.deleteComment(commentNo);

		//		assertSame(result, 1);
	}

	@Test
	public void testSelectCommentByCondition() throws Exception {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 2L);
		//		condition.put("commentNoForeach", Arrays.asList(1L, 2L, 3L));
		condition.put("commentNoForeach", new ArrayList<Long>());
		commentJdbcRepository.selectCommentByCondition(condition);
	}
}