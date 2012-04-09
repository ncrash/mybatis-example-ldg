package kr.pe.ldg.mybatis.example1.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("Comment")
@SuppressWarnings("serial")
public class Comment implements Serializable {
	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;

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
