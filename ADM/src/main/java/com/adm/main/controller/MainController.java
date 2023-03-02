package com.adm.main.controller;



import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
	
	
	@RequestMapping("/")
	public String index() {		
		System.out.println("�־�Ÿ");
		return "index";
	}
	
	@GetMapping("/api/hello")
    public String hello(){
        return "�ȳ��ϼ���. ���� �����ð��� "+new Date() +"�Դϴ�. \n";
    }
	
	@RequestMapping("/weather")
	public String weather() {
		System.out.println("����");
		return "weather";
	}
}

