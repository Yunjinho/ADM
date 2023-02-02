package com.adm.main.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.DateSchedulesDTO;
import com.adm.main.repository.DateSchedulesRepository;

@SpringBootTest
class gatherschedules {
	
	@Autowired
	DateSchedulesRepository re;
	@Test
	void contextLoads() {
		DateSchedulesDTO date;
		
		insert();
	}
	
	void insert() {
	}
	void delete() {
		
	}
	
	void update() {
		
	}
	void find() {
		
	}
}
