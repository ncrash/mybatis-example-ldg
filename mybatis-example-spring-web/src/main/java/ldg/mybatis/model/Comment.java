package ldg.mybatis.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Comment implements Serializable {
	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;

	public Comment() {
	}

	public Comment(Long commentNo, String userId, Date regDate, String commentContent) {
		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
	}

	public Long getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(Long commentNo) {
		this.commentNo = commentNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

}
