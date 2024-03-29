package com.bori.service;

import org.springframework.stereotype.Service;

import com.bori.model.CheckRequest;

@Service
public class TypoCheckService {

	public boolean typoCheck(CheckRequest checkReq) {		
//		sentence.equalsIgnoreCase(inputText);
		return checkReq.getInputText().equalsIgnoreCase(checkReq.getQuest());		
	}
}
