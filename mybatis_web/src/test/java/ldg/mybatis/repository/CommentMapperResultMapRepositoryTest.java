package ldg.mybatis.repository;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CommentMapperResultMapRepositoryTest {
	private final CommentMapperResultMapRepository commentMapperResultMapRepository = new CommentMapperResultMapRepository();
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;
	private final Long commentNo2 = 2L;

	@Before
	public void setUp() throws Exception {
		commentMapperRepository.deleteComment(commentNo);
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId("fromm0");
		comment.setCommentContent("test");
		comment.setRegDate(Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);
		
		commentMapperRepository.deleteComment(commentNo2);
		comment = new Comment();
		comment.setCommentNo(commentNo2);
		comment.setUserId("manager");
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

	@Test
	public void testSelectCommentByPrimaryKeyConstructor2() throws Exception {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyConstructor2(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyAssociation2() throws Exception {
		CommentUser result = commentMapperResultMapRepository.selectCommentByPrimaryKeyAssociation2(commentNo);
		assertNotNull(result);
	}

	@Ignore
	@Test
	public void testSelectCommentByPrimaryKeyCollection2() throws Exception {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyCollection2(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyDiscriminator2() throws Exception {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo);
		assertNotNull(result);
		
		result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo2);
		assertNotNull(result);
	}
}
