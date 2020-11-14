package com.codex.freshvotes.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable {
	private static final long serialVersionUID = 4215061788413107080L;

	@ManyToOne
	private User user;

	@ManyToOne
	private Feature feature;
}
