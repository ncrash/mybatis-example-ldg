package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.User;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.fail;

public class CommentSessionDynamicSqlRepositoryTest {
	private final CommentSessionDynamicSqlRepository commentSessionDynamicSqlRepository = new CommentSessionDynamicSqlRepository();

    @Test
	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

        List<Comment> comments = commentSessionDynamicSqlRepository.selectCommentByCondition(condition);

        assertThat(comments.size(), greaterThanOrEqualTo(1));
    }

    @Test
	public void testSelectCommentByConditionIf() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionIf(condition);
        fail();
	}

    @Test
	public void testSelectCommentByConditionChoose() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionChoose(condition);
        fail();
	}

    @Test
	public void testSelectCommentByConditionTrim() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionTrim(condition);
        fail();
	}

    @Test
	public void testSelectCommentByConditionForeach() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNos", Arrays.asList(1L, 2L));

		commentSessionDynamicSqlRepository.selectCommentByConditionForeach(condition);
        fail();
	}

    @Test
	public void testSelectOgnlStaticField() {
		commentSessionDynamicSqlRepository.selectOgnlStaticField();
        fail();
	}

    @Test
	public void testSelectOgnlStaticMethod() {
		commentSessionDynamicSqlRepository.selectOgnlStaticMethod();
        fail();
	}

    @Test
	public void testSelectOgnlStaticMethod2() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("userId", "fromm0");

		commentSessionDynamicSqlRepository.selectOgnlStaticMethod2(condition);
        fail();
	}

	private User makeUser() {
		User user = new User();
		user.setUserId("fromm0");
		user.setUserName("이동국");
		return user;
	}
}