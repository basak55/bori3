package com.bori;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestRunner implements ApplicationRunner{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Connection connection = dataSource.getConnection();
		log.info("DBCP: "+dataSource.getConnection()); //사용하는 DBCP타입 확인
		log.info("Url: "+connection.getMetaData().getURL());
		log.info("UserName: "+connection.getMetaData().getUserName());
		
		//Sentence
		jdbcTemplate.execute("INSERT INTO Sentence(sent, writer) VALUES ('노인이 젊은이에게 얘기하듯이 망자도 산자에게 이야기하려고 노력한다면 좋을텐데.', 'Willa Cather')");
		jdbcTemplate.execute("INSERT INTO Sentence(sent, writer) VALUES ('인생은 백치가 지껄이는 이야기와 같다. 시끄럽고 정신없으나 아무 뜻도 없다.', 'William Shakespeare')");
		jdbcTemplate.execute("INSERT INTO Sentence(sent, writer) VALUES ('명성에는 이런 큰 단점도 있는 바, 바로 우리가 그것을 좇을 수록 다른 이들의 비위를 맞추는데 우리 인생을 경주해야한다는 것이다.', 'Baruch Spinoza')");
		jdbcTemplate.execute("INSERT INTO Sentence(sent, writer) VALUES ('인생은 같은 얘기를 또 듣는 것과 같이 나른한 사람의 흐릿한 귀를 거슬리게 한다.', 'William Shakespeare')");
		
		//Member
		jdbcTemplate.execute("INSERT INTO Member(mid, mpw, exp) VALUES ('admin', 'admin', 5000)");
		jdbcTemplate.execute("INSERT INTO Member(mid, mpw, exp) VALUES ('eyes', 'eyes', 0)");
		jdbcTemplate.execute("INSERT INTO Member(mid, mpw, exp) VALUES ('ears', 'ears', 0)");
		jdbcTemplate.execute("INSERT INTO Member(mid, mpw, exp) VALUES ('nose', 'nose', 0)");

	}	
}
