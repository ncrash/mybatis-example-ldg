package ldg.mybatis.model;

import java.io.Serializable;
import java.util.*;

import org.slf4j.*;

@SuppressWarnings("serial")
public class Comment implements Serializable {
	private static final Logger LOGGER = LoggerFactory.getLogger(Comment.class);

	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;

	private User user;
	private List<Reply> replies;
	private Reply reply;

	public Comment() {
	}

	public Comment(Long commentNo, String userId, Date regDate, String commentContent) {
		LOGGER.info("생성자 호출");

		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
	}

	public Long getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(Long commentNo) {
		LOGGER.info("setCommentNo 호출");

		this.commentNo = commentNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		LOGGER.info("setUserId 호출");

		this.userId = userId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		LOGGER.info("setRegDate 호출");

		this.regDate = regDate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		LOGGER.info("setCommentContent 호출");

		this.commentContent = commentContent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

}
