package com.bori.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bori.model.Member;
import com.bori.model.MemberRequest;

@Mapper
public interface MemberMapper {
	
	public boolean countMemberById(String mid);	//아이디 중복체크

	public void updateExp(int mno);				//경험치관리 (레벨)
	public int updateMember(Member member);		//회원정보 수정
	
	public void insertMember(MemberRequest memberReq);		//회원가입
	
	public Member selectById(String mid);		//아이디검색 (로그인)
	public Member selectByMno(int mno);			//회원정보 조회
}
