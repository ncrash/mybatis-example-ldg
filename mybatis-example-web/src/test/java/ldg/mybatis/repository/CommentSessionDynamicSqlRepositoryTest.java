package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.User;

public class CommentSessionDynamicSqlRepositoryTest {
	private final CommentSessionDynamicSqlRepository commentSessionDynamicSqlRepository = new CommentSessionDynamicSqlRepository();

	public static void main(String[] args) {
		CommentSessionDynamicSqlRepositoryTest test = new CommentSessionDynamicSqlRepositoryTest();

		test.testSelectCommentByCondition();
		test.testSelectCommentByConditionIf();
		test.testSelectCommentByConditionChoose();
		test.testSelectCommentByConditionTrim();
		test.testSelectCommentByConditionForeach();
		test.testSelectOgnlStaticField();
		test.testSelectOgnlStaticMethod();
		test.testSelectOgnlStaticMethod2();
	}

	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByCondition(condition);
	}

	public void testSelectCommentByConditionIf() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionIf(condition);
	}

	public void testSelectCommentByConditionChoose() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionChoose(condition);
	}

	public void testSelectCommentByConditionTrim() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionTrim(condition);
	}

	public void testSelectCommentByConditionForeach() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNos", Arrays.asList(1L, 2L));

		commentSessionDynamicSqlRepository.selectCommentByConditionForeach(condition);
	}

	private User makeUser() {
		User user = new User();
		user.setUserId("fromm0");
		user.setUserName("이동국");
		return user;
	}

	public void testSelectOgnlStaticField() {
		commentSessionDynamicSqlRepository.selectOgnlStaticField();
	}

	public void testSelectOgnlStaticMethod() {
		commentSessionDynamicSqlRepository.selectOgnlStaticMethod();
	}

	public void testSelectOgnlStaticMethod2() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("userId", "fromm0");

		commentSessionDynamicSqlRepository.selectOgnlStaticMethod2(condition);
	}
}