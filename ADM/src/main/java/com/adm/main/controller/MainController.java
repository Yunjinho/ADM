package com.adm.main.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	
	@RequestMapping("/")
	public String index() {		
		System.out.println("¿Ö¾ÈÅ¸");
		return "index";
	}
	
	@RequestMapping("/weather")
	public String weather() {
		System.out.println("³¯¾¾");
		return "weather";
	}
}

