package com.adm.main.userTests;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.User;
import com.adm.main.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserDeleteTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void deleteTest() {
		String userId = "hannah123";
		userRepo.deleteById(userId);
		
		Optional<User> optionalUser = userRepo.findById(userId);
		Assertions.assertThat(optionalUser).isNotPresent();
		
	}

}
