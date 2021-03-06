package com.spring.site;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.site.entity.Discussion;
import com.spring.site.form.DiscussionForm;

@Controller
@RequestMapping(value = "dashboard")
public class BoardController {

	@Inject
	DiscussionService discussionService;

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public String listDiscussions(Map<String, Object> model) {
		model.put("discussion", this.discussionService.getAllDiscussions());
		return "discussion/list";
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createDiscussion(Map<String, Object> model) {
		model.put("discussionForm", new DiscussionForm());
		return "discussion/create";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public View createDiscussion(DiscussionForm form) {
		Discussion discussion = new Discussion();
		discussion.setUser(form.getUser());
		discussion.setSubject(form.getSubject());
		discussion.setMessage(form.getMessage());
		this.discussionService.saveDiscussion(discussion);
		return new RedirectView("/discussion/" + discussion.getId() + "/"
				+ discussion.getUriSaftSubject(), true, false);
	}

}
