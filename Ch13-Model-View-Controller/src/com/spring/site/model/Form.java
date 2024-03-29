package com.spring.site.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Form {

	private String subject;
	private String body;
	private List<MultipartFile> attachments;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public List<MultipartFile> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<MultipartFile> attachments) {
		this.attachments = attachments;
	}
	
	
}
