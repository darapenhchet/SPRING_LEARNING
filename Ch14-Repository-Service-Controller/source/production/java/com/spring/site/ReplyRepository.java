package com.spring.site;

import java.util.List;

import com.spring.site.entity.Reply;

public interface ReplyRepository {

	public List<Reply> getForDisucussion(long id);
	
	public boolean add(Reply reply);
	
	public boolean update(Reply reply);
}
