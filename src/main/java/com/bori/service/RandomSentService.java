package com.bori.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bori.model.Sentence;
import com.bori.repository.SentenceMapper;

@Service
public class RandomSentService {
	
	@Autowired
	SentenceMapper sentenceMapper;

	public int randomsent() {
		Random random = new Random();
	    int sno;
	    do {
	        sno = random.nextInt(sentenceMapper.countSent());
	    } while (sno == 0); // 0이면 다시
	    return sno;
	}
	
	public Sentence selectForGame() {
		int sno = randomsent();
		return sentenceMapper.selectForGame(sno);
	}
}
