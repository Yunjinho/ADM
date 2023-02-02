package com.adm.main.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.repository.GatherSchedulesRepository;

@SpringBootTest
class dateschedules {
	
	@Autowired
	GatherSchedulesRepository re;
	@Test
	void contextLoads() {
		GatherSchedulesRepository gather;
		
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
