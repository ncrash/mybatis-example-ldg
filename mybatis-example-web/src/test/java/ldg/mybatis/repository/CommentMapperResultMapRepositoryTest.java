package ldg.mybatis.repository;

import java.util.Calendar;

import ldg.mybatis.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CommentMapperResultMapRepositoryTest {
	private final CommentMapperResultMapRepository commentMapperResultMapRepository = new CommentMapperResultMapRepository();
	private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();

	private final Long commentNo = 1L;
	private final Long commentNo2 = 2L;

    @Before
    public void setup() {
        makeSampleData();
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

    @Test
    public void testSelectCommentByPrimaryKey() {
        Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKey(commentNo);

        assertThat(result.getCommentNo(), equalTo(commentNo));
    }

    @Test
	public void testSelectCommentByPrimaryKeyConstructor2() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyConstructor2(commentNo);

        assertThat(result.getCommentNo(), equalTo(commentNo));
	}

    @Test
	public void testSelectCommentByPrimaryKeyAssociation2() {
		CommentUser result = commentMapperResultMapRepository.selectCommentByPrimaryKeyAssociation2(commentNo);

        assertThat(result, notNullValue());
	}

    @Test
	public void testSelectCommentByPrimaryKeyCollection2() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyCollection2(commentNo);

        assertThat(result, notNullValue());
	}

    @Test
	public void testSelectCommentByPrimaryKeyDiscriminator2() {
		Comment result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo);
        assertThat(result.getCommentNo(), equalTo(commentNo));

		result = commentMapperResultMapRepository.selectCommentByPrimaryKeyDiscriminator2(commentNo2);
        assertThat(result.getCommentNo(), equalTo(commentNo2));
	}
}
