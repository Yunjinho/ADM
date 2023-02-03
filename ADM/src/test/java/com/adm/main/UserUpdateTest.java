package com.adm.main;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.adm.main.dto.User;
import com.adm.main.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

class UserUpdateTest extends AdmApplicationTests {
	
	@Autowired
	UserRepository userRe;

	@Test
	void update() {
		
		Optional<User> user = userRe.findById("ehdwns8467");
		
		user.ifPresent(selectUser ->{
			User newUser = 
					User.builder()
					.userid(selectUser.getUserid())
					.password("9048467")
					.gender(selectUser.getGender())
					.address(selectUser.getAddress())
					.profileimg1(selectUser.getProfileimg1())
					.profileimg2(selectUser.getProfileimg2())
					.phone(selectUser.getPhone())
					.email("ehdwns8467@gmail.com")
					.name(selectUser.getName())
					.birth(selectUser.getBirth())
					.job(selectUser.getJob())
					.hobby("클라이밍")
					.interest(selectUser.getInterest())
					.exposure_yn(1)
					.nickname(selectUser.getNickname())
					.build();
			
			userRe.save(newUser);
			
					
		});

				
	}

}
