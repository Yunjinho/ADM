package com.adm.main.test;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
		chatMsg=new ChattingMessageDTO().builder()
				.message("hi")
				.userid("dbswlsgh")
				.messageid(1)
				.send_date(new Date())
				.build();
		insert(chatMsg);
	}
	
	void insert(ChattingMessageDTO c) {
		re.save(c);
	}
	void delete(int pk) {
		re.deleteById(pk);
	}
	
	void update(ChattingMessageDTO c) {
		c.setMessage("바꿩요");
		re.save(c);
	}
	Optional<ChattingMessageDTO> find(int pk) {
		return re.findById(pk);
	}
	List<ChattingMessageDTO> findall(){
		return re.findAll();
	}

}
