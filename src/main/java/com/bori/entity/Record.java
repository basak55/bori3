package com.bori.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Record {

	@Id
	private Integer mno;
	private Integer rno;
	private Integer playtime;
	private Integer visit;
	private Integer questcount;
	
}
