package com.bori.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bori.model.LoginRequest;
import com.bori.model.Member;
import com.bori.model.MemberRequest;
import com.bori.repository.MemberMapper;
import com.bori.repository.RecordMapper;

@Service
public class MemberInfoService {

	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	RecordMapper recordMapper;
	
	//회원가입
	public void insertMember(MemberRequest memberReq) {
		memberMapper.insertMember(memberReq);
	}
	
	//중복아이디 조회
	public boolean countMemberById(String mid) {
		return memberMapper.countMemberById(mid);
	}
	
	//회원정보 수정
	public int updateMember(Member member) {
		memberMapper.updateMember(member);
		return member.getMno();
	}
	
	//회원정보 조회
	public Member selectByMno(int mno) {
		Member member = memberMapper.selectByMno(mno);
		return member;
	}
	
	//로그인
	public int login(LoginRequest logReq) {
		//입력한 id로 회원정보 확인
		Member member = memberMapper.selectById(logReq.getMid());
		if(member == null) { //존재하지 않는 아이디
			return 0;
		}
		if(!member.getMpw().equals(logReq.getMpw())) { // 잘못된 비밀번호
			return -1;
		} else {
			recordMapper.updateVisit(); // 방문횟수 증가
			return member.getMno(); // 로그인 성공
		}	
	}
	

}
