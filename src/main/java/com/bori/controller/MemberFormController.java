package com.bori.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bori.model.LoginRequest;
import com.bori.model.MemberRequest;
import com.bori.service.MemberInfoService;

@Controller
public class MemberFormController {
	
	@Autowired
	MemberInfoService memberInfoService;
	

	//회원가입 페이지
	@GetMapping("/signIn")
	public String signIn() {
		return "/th/signIn";
	}
	
	//회원 가입  
	@PostMapping("/member")
	public String insertMember(MemberRequest memberReq) {
		memberInfoService.insertMember(memberReq);
		return "index";
	}
	
	//로그인 페이지
	@GetMapping("/login")
	public String login() {
		return "/th/loginForm";
	}
	
	//로그인 체크
	@PostMapping("/loginCheck")
	public String loginCheck(LoginRequest logReq, Model model, HttpSession session) {
		int loginStatus = memberInfoService.login(logReq);
		String id = logReq.getMid();
		if(loginStatus != 0 && loginStatus != -1) {
			session.setAttribute("loginId", logReq.getMid());
			model.addAttribute("login", id);
			return "index";
		} else {
			model.addAttribute("loginId","failed");
		} return "/th/loginForm";
	}
	
	
}
