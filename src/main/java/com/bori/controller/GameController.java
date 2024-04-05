package com.bori.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bori.model.CheckRequest;
import com.bori.service.CalculateAccuracyService;
import com.bori.service.RandomSentService;
import com.bori.service.TypoCheckService;

@RestController
public class GameController {
	
	@Autowired
	TypoCheckService typoCheckService;
	
//	@Autowired
//	CalculateAccuracyService calculateAccuracyService;

	
	
	@PostMapping("/check")
	public boolean typoCheck(CheckRequest checkReq) {
		return typoCheckService.typoCheck(checkReq);
	}
	
	@GetMapping("/endGame")
	public int endGame(@RequestParam int playTime) {
		return playTime;
	}
}
