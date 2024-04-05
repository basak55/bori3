package com.bori.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bori.repository.MemberMapper;

@Service
public class LevelUpService {

	@Autowired
	MemberMapper memberMapper;
	
	public void expCheck() {
		
	}
}
