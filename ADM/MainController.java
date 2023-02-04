package com.adm.main;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChattingroomRepository;

@Controller
public class MainController {
	@Autowired
	ChattingroomRepository re;
	@Autowired
	ChattingroomDTO chatroom;
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println("ø÷æ»≈∏");
		chatroom=new ChattingroomDTO().builder()
				.chatroomname("test")
				.chattime(new Date())
				.chatting_type(0)
				.build();
//		//re.save(chatroom);		
		return "index";
	}
}
