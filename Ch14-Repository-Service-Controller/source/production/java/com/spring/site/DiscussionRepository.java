package com.spring.site;

import java.util.List;

import com.spring.site.entity.Discussion;

public interface DiscussionRepository {

	public List<Discussion> getAll();
	
	public Discussion get(long id);
	
	public boolean add(Discussion discussion);
	
	public boolean update(Discussion discussion);
	
}
