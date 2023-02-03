package com.adm.main.test;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.ChatMembersDTO;
import com.adm.main.dto.ChattingMessageDTO;
import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChatMembersRepository;

@SpringBootTest
class chatmember {
	
	@Autowired
	ChatMembersRepository re;
	
	Optional<ChatMembersDTO> memberOp;
	@Test
	void contextLoads() {
		ChatMembersDTO memberDto;
		memberDto=new ChatMembersDTO().builder()
				.gmemberid(1)
				.userid("윤진호")
				.build();
		
		insert(memberDto);
	}
	
	void insert(ChatMembersDTO c) {
		re.save(c);
	}
	void delete(int pk) {
		re.deleteById(pk);
	}
	
	void update(ChatMembersDTO c) {
		c.setUserid("바뀜");
		re.save(c);
	}
	Optional<ChatMembersDTO> find(int pk) {
		return re.findById(pk);
	}
	List<ChatMembersDTO> findall(){
		return re.findAll();
	}
}
