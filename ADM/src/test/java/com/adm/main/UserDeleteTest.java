package com.adm.main;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.adm.main.dto.User;
import com.adm.main.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class UserDeleteTest extends AdmApplicationTests {
	
	@Autowired
	UserRepository userRe;

	@Test
	void delete() {
		Optional<User> user = userRe.findById("ehdwns8467");
		
		// 유저가 존재해야함
		Assertions.assertTrue(user.isPresent());
		
		// 있다면 삭제
		user.ifPresent(
				selectUser -> {
					userRe.deleteById(selectUser.getUserid());
			
		});
		
		// 지워졌는지 확인
		Optional<User> deletedUser = userRe.findById("ehdwns8467");
		Assertions.assertFalse(deletedUser.isPresent());
		
		
	}

}
