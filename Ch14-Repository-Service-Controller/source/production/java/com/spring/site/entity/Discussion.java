package com.spring.site.entity;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Discussion {

	private long id;
	private String user;
	private String subject;
	private String uriSaftSubject;
	private String message;
	private Instant createdAt;
	private Instant lastUpdatedAt;
	private Set<String> subscribedUsers = new HashSet<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getUriSaftSubject() {
		return uriSaftSubject;
	}
	public void setUriSaftSubject(String uriSaftSubject) {
		this.uriSaftSubject = uriSaftSubject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Instant getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	public Instant getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(Instant lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	public Set<String> getSubscribedUsers() {
		return subscribedUsers;
	}
	public void setSubscribedUsers(Set<String> subscribedUsers) {
		this.subscribedUsers = subscribedUsers;
	}
	
}
