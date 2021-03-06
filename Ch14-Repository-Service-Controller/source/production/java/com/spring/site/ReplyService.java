package com.spring.site;

import java.util.List;

import com.spring.site.entity.Reply;

public interface ReplyService {

	public List<Reply> getRepliesForDiscussio(long discussionId);
		
	public void saveReply(Reply reply);
}
