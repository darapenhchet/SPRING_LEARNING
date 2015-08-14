package com.spring.site;

import java.util.List;

import com.spring.site.entity.Discussion;

public interface DiscussionService {

	public List<Discussion> getAllDiscussions();
	
	public Discussion getDiscussion(long id);
	
	public void saveDiscussion(Discussion discussion);
	
}