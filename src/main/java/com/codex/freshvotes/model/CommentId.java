package com.codex.freshvotes.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CommentId implements Serializable{
	private static final long serialVersionUID = 6817548377039204470L;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Feature feature;
}
