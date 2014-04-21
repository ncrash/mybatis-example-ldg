package ldg.mybatis.repository;

import java.util.Calendar;

import ldg.mybatis.model.*;

public class CommentMapperResultMapRepositoryTest {
	private final CommentMapperResultMapRepository commentMapperResultMapRepository = new CommentMapperResultMapRepository();
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;
	private final Long commentNo2 = 2L;

	public static void main(String[] args) {
		CommentMapperResultMapRepositoryTest test = new CommentMapperResultMapRepositoryTest();

		test.makeSampleData();

		test.testSelectCommentByPrimaryKey();
		test.testSelectCommentByPrimaryKeyConstructor2();
		test.testSelectCommentByPrimaryKeyAssociation2();
//		test.testSelectCommentByPrimaryKeyCollection2();
		test.testSelectCommentByPrimaryKeyDiscriminator2();
	}

	public void makeSampleData() {
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

	public void testSelectCommentByPrimaryKey() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKey(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyConstructor2() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyConstructor2(commentNo);
		System.out.println(result);
	}

	public void testSelectCommentByPrimaryKeyAssociation2() {
		CommentUser result = commentMapperResultMapRepository.selectCommentByPrimaryKeyAssociation2(commentNo);
		System.out.println(result);
	}

//	public void testSelectCommentByPrimaryKeyCollection2() {
//		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyCollection2(commentNo);
//		System.out.println(result);
//	}

	public void testSelectCommentByPrimaryKeyDiscriminator2() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo);
		System.out.println(result);

		result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo2);
		System.out.println(result);
	}
}
