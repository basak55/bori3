package com.bori;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bori.model.CheckRequest;
import com.bori.model.Sentence;
import com.bori.repository.MemberMapper;
import com.bori.repository.SentenceMapper;
import com.bori.service.CalculateAccuracyService;
import com.bori.service.RandomSentService;
import com.bori.service.TypoCheckService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Project3ApplicationTests {
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	SentenceMapper sentenceMapper;
	
	@Autowired
	RandomSentService randomSentService;
	
	@Autowired
	TypoCheckService typoCheckService;
	
	@Test
	void countMemberById() {
		log.info("boolean: {}", memberMapper.countMemberById("admin"));
	}
	
//	@Test
//	void calculate() {
//		CheckRequest checkReq = CheckRequest.builder().quest("가나다").inputText("가나라").build();
//		log.info("정오: ", typoCheckService);
//	}

//	@Test
//	void contextLoads() {
//	}
//	
//	@Test
//	void countSent() {
//		log.info("카운트: {}",sentenceMapper.countSent());
//	}
//	
//	@Test
//	void insertSentence() {
//		Sentence sent = Sentence.builder().sent("가나다라").writer("세종대왕").build();
//		sentenceMapper.insertSentence(sent);
//	}
//	
//	@Test
//	void selectForGame() {
//		int sno = randomSentService.randomsent();
//		log.info("int: {}", sno);
//	    Sentence sentence = sentenceMapper.selectForGame(sno);
//	    log.info("랜덤: {}", sentence);
//	}

}
