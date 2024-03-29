package com.bori.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bori.model.CheckRequest;
import com.bori.service.CalculateAccuracyService;
import com.bori.service.RandomSentService;
import com.bori.service.TypoCheckService;

@Controller
public class MyController {
	
	@Autowired
	RandomSentService randomSentService;
	
	@Autowired
	TypoCheckService typoCheckService;
	
	@Autowired
	CalculateAccuracyService calculateAccuracyService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/game")
	public String game(Model model) {
//		System.out.println(randomSentService.selectForGame());
		model.addAttribute("sent", randomSentService.selectForGame());
		return "game";
	}
	
	@PostMapping("/check")
	public String typoCheck(Model model, CheckRequest checkReq) {
//		System.out.println(checkReq.getInputText());
//		System.out.println(checkReq.getQuest());
		model.addAttribute("check", typoCheckService.typoCheck(checkReq));
		return "result";
	}
}
