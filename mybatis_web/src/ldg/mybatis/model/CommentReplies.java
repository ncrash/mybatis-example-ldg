package ldg.mybatis.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class CommentReplies implements Serializable {
	private Comment comment;
	private List<Reply> replies;

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

}
