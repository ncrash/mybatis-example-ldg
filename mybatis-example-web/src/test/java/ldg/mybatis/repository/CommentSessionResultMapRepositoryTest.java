package ldg.mybatis.repository;

import java.util.Calendar;

import ldg.mybatis.model.*;

public class CommentSessionResultMapRepositoryTest {
	private final CommentSessionResultMapRepository commentSessionResultMapRepository = new CommentSessionResultMapRepository();
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;

	public static void main(String[] args) {
		CommentSessionResultMapRepositoryTest test = new CommentSessionResultMapRepositoryTest();

		test.testSelectCommentByPrimaryKey();
		test.testSelectCommentByPrimaryKeyConstructor();
		test.testSelectCommentByPrimaryKeyAssociation();
		test.testSelectCommentByPrimaryKeyCollection();
		test.testSelectCommentByPrimaryKeyDiscriminator();
		test.testSelectColumnPrefix();

	}

	public void setUp() throws Exception {
		commentMapperRepository.deleteComment(commentNo);
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId("fromm0");
		comment.setCommentContent("test");
		comment.setRegDate(Calendar.getInstance().getTime());
		commentMapperRepository.insertComment(comment);
	}

	public void testSelectCommentByPrimaryKey() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKey(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyConstructor() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyConstructor(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyAssociation() {
		CommentUser result = commentSessionResultMapRepository.selectCommentByPrimaryKeyAssociation(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyCollection() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyCollection(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyDiscriminator() {
		Comment result = commentSessionResultMapRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
		System.out.println(result);
	}

	public void testSelectColumnPrefix() {
		CommentColumnPrefix result = commentSessionResultMapRepository.selectColumnPrefix(commentNo);
		System.out.println(result);
	}
}