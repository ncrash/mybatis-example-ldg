package ldg.mybatis.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CommentColumnPrefix implements Serializable {
	private Comment comment1;
	private Comment comment2;

	public CommentColumnPrefix() {
	}

	public CommentColumnPrefix(Comment comment1, Comment comment2) {
		this.comment1 = comment1;
		this.comment2 = comment2;
	}

	public Comment getComment1() {
		return comment1;
	}

	public void setComment1(Comment comment1) {
		this.comment1 = comment1;
	}

	public Comment getComment2() {
		return comment2;
	}

	public void setComment2(Comment comment2) {
		this.comment2 = comment2;
	}
}
