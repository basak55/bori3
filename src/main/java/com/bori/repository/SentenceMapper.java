package com.bori.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bori.model.Sentence;

@Mapper
public interface SentenceMapper {

	public void insertSentence(Sentence sentence);
	public void updateSentence(Sentence sentence);
	public int countSent();
	public Sentence selectForGame(int sno);
}
