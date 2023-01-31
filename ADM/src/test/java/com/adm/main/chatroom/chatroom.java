package com.adm.main.chatroom;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChattingroomRepository;

@SpringBootTest
class chatroom {
	
	@Autowired
	ChattingroomRepository re;
	@Test
	void contextLoads() {
		ChattingroomDTO chatroom=new ChattingroomDTO().builder()
				.chatroomname("test")
				.chattime(new Date())
				.chatting_type(0)
				.build();
		
		re.save(chatroom);
	}

}
