package com.adm.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adm.main.dto.ChattingroomDTO;
import com.adm.main.repository.ChattingroomRepository;
import com.adm.main.repository.GatherRepository;
import com.adm.main.service.GatherService;

@Controller
public class MainController {
	@Autowired
	ChattingroomRepository re;

	
//	@RequestMapping("/")
//	public String index() {
//		ChattingroomDTO chatroom=new ChattingroomDTO().builder()
//				.chatroomname("test")
//				.chattime(new Date())
//				.chatting_type(0)
//				.build();
//		System.out.println(chatroom);
//		re.save(chatroom);
//		
//		return "NewFile";
//	}
	

}
