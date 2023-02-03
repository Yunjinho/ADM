package com.adm.main;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.User;
import com.adm.main.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class UserReadTest extends AdmApplicationTests {
	
	String  day = "1996-08-25"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	UserRepository userRe;

	@Test
	void read() {
		Optional<User> user = userRe.findById("ehdwns8467");
		
		user.ifPresent(selectUser -> {
			
			log.info(selectUser.toString());
			
		});
		
		
		
		
	}

}
