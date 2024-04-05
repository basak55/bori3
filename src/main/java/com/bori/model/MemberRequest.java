package com.bori.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberRequest {

	private String mid;
	private String mpw;
	private String name;
	private String gender;
	private String mintro;
}
