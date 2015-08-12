package com.spring.site;
import java.time.Instant;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class HomeController {

	@RequestMapping("/")
	public View home(Map<String, Object> model){
		
		model.put("dashboardUrl", "dashboard");
		return new RedirectView("/{dashboardUrl}", true);
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public String dashboard(Map<String, Object> model){
		model.put("text", "This is a model attribute.");
		model.put("date", Instant.now());
		return "dashboard";
	}
}
