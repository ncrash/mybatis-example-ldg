package ldg.mybatis.repository;

import static org.junit.Assert.assertNotNull;

import java.util.Calendar;

import ldg.mybatis.model.*;

import org.junit.*;

public class CommentSessionResultMapRepositoryTest {
	private final CommentSessionResultMapRepository commentSessionResultMapRepository = new CommentSessionResultMapRepository();
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
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKey(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyConstructor() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyConstructor(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyAssociation() {
		CommentUser result = commentSessionResultMapRepository.selectCommentByPrimaryKeyAssociation(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyCollection() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyCollection(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectCommentByPrimaryKeyDiscriminator() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
		assertNotNull(result);
	}

	@Test
	public void testSelectColumnPrefix() {
		CommentColumnPrefix result = commentSessionResultMapRepository.selectColumnPrefix(commentNo);
		assertNotNull(result);
	}
}