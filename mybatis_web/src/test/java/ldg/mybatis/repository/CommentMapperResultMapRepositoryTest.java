package ldg.mybatis.repository;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import ldg.mybatis.model.Comment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CommentMapperResultMapRepositoryTest {
	private final CommentMapperResultMapRepository commentMapperResultMapRepository = new CommentMapperResultMapRepository();
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;

	@Before
	public void setUp() throws Exception {
		commentMapperRepository.deleteComment(commentNo);
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId("fromm0");
		comment.setCommentContent("test");
		comment.setRegDate(Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectCommentByPrimaryKey() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKey(commentNo);
		assertNotNull(result);
	}
}
