package com.bori.service;

import org.springframework.stereotype.Service;

@Service
public class typoCheckService {

	public void typoCheck(String sentence, String inputText) {
		
		sentence.equalsIgnoreCase(inputText);
		
	}
}
