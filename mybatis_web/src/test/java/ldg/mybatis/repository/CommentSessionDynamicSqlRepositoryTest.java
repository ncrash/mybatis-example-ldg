package ldg.mybatis.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ldg.mybatis.model.User;

import org.junit.Test;

public class CommentSessionDynamicSqlRepositoryTest {
	private final CommentSessionDynamicSqlRepository commentSessionDynamicSqlRepository = new CommentSessionDynamicSqlRepository();

	@Test
	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByCondition(condition);
	}

	@Test
	public void testSelectCommentByConditionIf() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionIf(condition);
	}

	@Test
	public void testSelectCommentByConditionChoose() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionChoose(condition);
	}

	@Test
	public void testSelectCommentByConditionTrim() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 1L);
		condition.put("user", makeUser());

		commentSessionDynamicSqlRepository.selectCommentByConditionTrim(condition);
	}

	@Test
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

	@Test
	public void testSelectOgnlStaticField() throws Exception {
		commentSessionDynamicSqlRepository.selectOgnlStaticField();
	}

	@Test
	public void testSelectOgnlStaticMethod() throws Exception {
		commentSessionDynamicSqlRepository.selectOgnlStaticMethod();
	}

	@Test
	public void testSelectOgnlStaticMethod2() throws Exception {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("userId", "fromm0");

		commentSessionDynamicSqlRepository.selectOgnlStaticMethod2(condition);
	}
}