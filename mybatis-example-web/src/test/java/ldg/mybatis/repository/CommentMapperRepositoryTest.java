package ldg.mybatis.repository;

import java.util.*;

import ldg.mybatis.model.*;
import ldg.mybatis.repository.CommentMapperRepository;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CommentMapperRepositoryTest {
    private final CommentMapperRepository commentMapperRepository = new CommentMapperRepository();
    private static final Long commentNo = 1L;

    @Before
    public void setup() {
        commentMapperRepository.deleteComment(commentNo);
        commentMapperRepository.insertComment(getComment());
    }

    @Test
    public void testSelectCommentByPrimaryKey() {
        Comment comment = commentMapperRepository.selectCommentByPrimaryKey(commentNo);

        assertThat(comment, notNullValue());
    }

    @Test
    public void testSelectCommentByCondition() {
        Map<String, Object> condition = new HashMap<String, Object>();
        condition.put("commentNo", 1L);
        condition.put("user", makeUser());

        List<Comment> comments = commentMapperRepository.selectCommentByCondition(condition);

        assertThat(comments.size(), equalTo(1));
    }

    @Test
    public void testInsertComment() {
        commentMapperRepository.deleteComment(commentNo);
        Integer integer = commentMapperRepository.insertComment(getComment());

        assertThat(integer, equalTo(1));
    }

    @Test
    public void testDeleteComment() {
        Integer integer = commentMapperRepository.deleteComment(commentNo);

        assertThat(integer, equalTo(1));
    }

    private Comment getComment() {
        User user = makeUser();

        return makeComment(1L, user.getUserId(), user.getUserName(), Calendar.getInstance().getTime());
    }

    private Comment makeComment(Long commentNo, String userId, String commentContent, Date regDate) {
        Comment comment = new Comment();
        comment.setCommentNo(commentNo);
        comment.setUserId(userId);
        comment.setCommentContent(commentContent);
        comment.setRegDate(regDate);
        return comment;
    }

    private User makeUser() {
        User user = new User();
        user.setUserId("fromm0");
        user.setUserName("이동국");
        return user;
    }
}
