package com.spring.site;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.site.entity.Discussion;
import com.spring.site.entity.Reply;
import com.spring.site.form.ReplyForm;

@Controller
@RequestMapping("discussion/{discussionId:\\d+}")
public class DiscussionController {
	
	@Inject DiscussionService discussionService;
	@Inject ReplyService replyService;
	
	@RequestMapping(value= {"","*"}, method= RequestMethod.GET)
	public String viewDiscussion(Map<String, Object> model, 
								 @PathVariable("discussionId") long id){
		Discussion discussion = this.discussionService.getDiscussion(id);
		if(discussion != null){
			model.put("discussion", discussion);
			model.put("replies", this.replyService.getRepliesForDiscussio(id));
			model.put("replyForm", new ReplyForm());
			return "discussion/view";
		}
		return "discussion/errorNoDiscussion";
	}
	
	@RequestMapping(value="reply", method=RequestMethod.POST)
	public ModelAndView reply(ReplyForm form,
							  @PathVariable("discussionId") long id){
		Discussion discussion = this.discussionService.getDiscussion(id);
		if(discussion !=null){
			Reply reply = new Reply();
			reply.setDiscussionId(id);
			reply.setUser(form.getUser());
			this.replyService.saveReply(reply);
			
			return new ModelAndView(new RedirectView("/discussion/" + id + "/" + 
									discussion.getUriSaftSubject(), true, false));
		}
		return new ModelAndView("discussion/errorNoDiscussion");
	}
}
