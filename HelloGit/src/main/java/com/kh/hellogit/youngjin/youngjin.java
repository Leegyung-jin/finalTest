package com.kh.hellogit.youngjin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class youngjin {
	@RequestMapping("login.do")
	public String login(String id, String pwd) {
		return "home";
	}
	
	@RequestMapping("okay.do")
	public String okay(String id, String pwd) {
		return "home2";
	}
	
	
}
