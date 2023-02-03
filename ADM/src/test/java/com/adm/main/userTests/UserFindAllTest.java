package com.adm.main.userTests;

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
public class UserFindAllTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void findAllTest() {
		Iterable<User> users = userRepo.findAll();
		Assertions.assertThat(users).hasSizeGreaterThan(0);
		
		for (User user : users) {
			System.out.println(user);
		}
		
	}
	
	

}
