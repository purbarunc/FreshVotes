package com.codex.freshvotes.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	@EmbeddedId
	private VoteId voteId;

	private Boolean upvote;

	public VoteId getVoteId() {
		return voteId;
	}

	public void setVoteId(VoteId voteId) {
		this.voteId = voteId;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
}
