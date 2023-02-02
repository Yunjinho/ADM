package com.adm.main.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.ChattingMessageDTO;
import com.adm.main.repository.ChattingMessageRepository;

@SpringBootTest
class chatmessages {
	
	@Autowired
	ChattingMessageRepository re;
	@Test
	void contextLoads() {
		ChattingMessageDTO chatMsg;
		
		insert();
	}
	
	void insert() {
	}
	void delete() {
		
	}
	
	void update() {
		
	}
	void find() {
		
	}

}
