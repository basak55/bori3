package com.bori.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/game")
	public String game() {
		return "game";
	}
	
	@GetMapping("check")
	public String checkTypo() {
		//서비스 호출
		return "game";
	}
}
