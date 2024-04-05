package com.bori.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	
	private int mno;
	private String mid;
	private String mpw;
	private String name;
	private String gender;
	private int exp;
	private String mintro;
	
	public Member(String mid) {
		super();
		this.mid = mid;
	}
	
	
}

