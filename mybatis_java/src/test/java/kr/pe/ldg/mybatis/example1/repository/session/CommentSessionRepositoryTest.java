package kr.pe.ldg.mybatis.example1.repository.session;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import kr.pe.ldg.mybatis.example1.model.Comment;

import org.junit.Test;

public class CommentSessionRepositoryTest {
	private final CommentSessionRepository commentSessionRepository = new CommentSessionRepository();

	@Test
	public void testSelectCommentByPrimaryKey() {
		Long commentNo = 1L;
		Comment comment = commentSessionRepository.selectCommentByPrimaryKey(commentNo);
		
		assertNotNull(comment);
	}

	@Test
	public void testInsertComment() {
		Long commentNo = 1L;
		String userId = "fromm0";
		Date regDate = Calendar.getInstance().getTime();
		String commentContent = "test";

		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
//		comment.setUserId(userId);
//		comment.setCommentContent(commentContent);
//		comment.setRegDate(regDate);
		commentSessionRepository.deleteComment(commentNo);
		
		Integer result = commentSessionRepository.insertComment(comment);

		assertSame(result, 1);
	}
	
	@Test
	public void testUpdateComment() {
		Long commentNo = 1L;
		String commentContent = "test";
		
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
//		comment.setCommentContent(commentContent);
		Integer result = commentSessionRepository.updateComment(comment);
		
		assertSame(result, 1);
	}
	
	@Test
	public void testDeleteComment() {
		Long commentNo = 1L;
		Integer result = commentSessionRepository.deleteComment(commentNo);
		
		assertSame(result, 1);
	}

	@Test
	public void testSelectCommentByCondition() throws Exception {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 2L);
		//		condition.put("commentNoForeach", Arrays.asList(1L, 2L, 3L));
		condition.put("commentNoForeach", new ArrayList<Long>());
		commentSessionRepository.selectCommentByCondition(condition);
	}

}
