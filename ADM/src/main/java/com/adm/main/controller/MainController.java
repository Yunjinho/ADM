package com.adm.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		return "main";
	}	
	@RequestMapping("/weather")
	public String weather() {
		System.out.println("����");
		return "weather";
	}
}
