package com.adm.main.controller;



import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
	
	
	@RequestMapping("/")
	public String index() {		
		System.out.println("왜안타");
		return "index";
	}
	
	@GetMapping("/api/hello")
    public String hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
	
	@RequestMapping("/weather")
	public String weather() {
		System.out.println("날씨");
		return "weather";
	}
}

