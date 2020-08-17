package com.kh.hellogit.zzim.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ZzimController {
	@RequestMapping("login.do")
	public String ZzimLogin(String id, String pwd) {
		return "home";
		//esssss
	}
}
