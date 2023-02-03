package com.adm.main.test;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChattingroomRepository;

@SpringBootTest
class chatroom {
	
	@Autowired
	ChattingroomRepository re;
	
	Optional<ChattingroomDTO> chatroom;
	//ChattingroomDTO chatroom;
	@Test
	void contextLoads() {
		
		//insert(chatroom);
		/* chatroom = find(); */
		/* chatroom.get(); */
		/* System.out.println(chatroom); */
		//delete(1);
		chatroom=find(1);
		/*
		 * chatroom=new ChattingroomDTO().builder() .chatroomname("change")
		 * .chattime(new Date()) .chatting_type(0) .build();
		 */
		
		ChattingroomDTO a;
		
		a=chatroom.get();
		
		
		String text="123";
		
		update_chatroomname(a,text);
		
		System.out.println(findall());
	}
	
	void insert(ChattingroomDTO c) {
		re.save(c);
	}
	
	void delete(int pk) {
		re.deleteById(pk);
	}
	
	void update_chatroomname(ChattingroomDTO c, String txt) {
		c.setChatroomname(txt);
		re.save(c);
	}
	
	Optional<ChattingroomDTO> find(int pk) {
		return re.findById(pk);
	}
	
	List<ChattingroomDTO> findall(){
		return re.findAll();
	}
}
