package com.codex.freshvotes.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
	@EmbeddedId
	private CommentId commentId;
	
	@Column(length = 1000)
	private String text;

	public CommentId getCommentId() {
		return commentId;
	}

	public void setCommentId(CommentId commentId) {
		this.commentId = commentId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
