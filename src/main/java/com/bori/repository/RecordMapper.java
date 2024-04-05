package com.bori.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper {

	public void updateVisit(); //방문횟수 -> 로그인할때 증가
}
