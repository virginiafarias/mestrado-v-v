package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/home")
public class JenkinsController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
