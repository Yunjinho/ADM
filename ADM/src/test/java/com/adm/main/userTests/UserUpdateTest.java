package com.adm.main.userTests;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.entity.User;
import com.adm.main.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserUpdateTest {
	
	String  day = "1996-06-12"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void updateTest() {
		
		String userId = "jino1234";
		Optional<User> optionalUser = userRepo.findById(userId);
		User user = optionalUser.get();
		user.setBirth(mdate);
		userRepo.save(user);
		
		User updateUser = userRepo.findById(userId).get();
		Assertions.assertThat(updateUser.getEmail()).isEqualTo(mdate);
			
	}
	
	

}
