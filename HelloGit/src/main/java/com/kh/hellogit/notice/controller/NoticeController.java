package com.kh.hellogit.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	@RequestMapping("login.do")
	public String insertNotice(int nId) {
		return "Home";
	}
}
