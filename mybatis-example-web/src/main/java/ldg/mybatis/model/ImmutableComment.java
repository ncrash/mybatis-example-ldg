package ldg.mybatis.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public class ImmutableComment implements Serializable {
	private final Long commentNo;
	private final String userId;
	private final Date regDate;
	private final String commentContent;

	public ImmutableComment() {
		this.commentNo = 1L;
		this.userId = "";
		this.regDate = Calendar.getInstance().getTime();
		this.commentContent = "";
	}

	public ImmutableComment(Long commentNo, String userId, Date regDate, String commentContent) {
		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
	}

	public Long getCommentNo() {
		return commentNo;
	}

	public String getUserId() {
		return userId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public String getCommentContent() {
		return commentContent;
	}
}
