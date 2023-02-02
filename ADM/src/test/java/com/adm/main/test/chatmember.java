package com.adm.main.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.ChatMembersDTO;
import com.adm.main.repository.ChatMembersRepository;

@SpringBootTest
class chatmember {
	
	@Autowired
	ChatMembersRepository re;
	@Test
	void contextLoads() {
		ChatMembersDTO chatmem;
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
