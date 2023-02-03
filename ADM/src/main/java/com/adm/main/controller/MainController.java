package com.adm.main.controller;

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
		chatroom=new ChattingroomDTO().builder()
				.chatroomname("test")
				.chattime(new Date())
				.chatting_type(0)
				.build();
		//re.save(chatroom);
		System.out.println("연결");
		return "index";
	}
}