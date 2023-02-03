package com.adm.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.User;
import com.adm.main.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class UserCreateTest extends AdmApplicationTests {
	
	String  day = "1996-08-25"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	UserRepository userRe;

	@Test
	void create() {
		User user = 
			User.builder()
				.userid("jino1234")
				.password("1234")
				.gender("남자")
				.address("동작구")
				.profileimg1("a.jpg")
				.profileimg2("b.jpg")
				.phone("0101235678")
				.email("jino@gmail.com")
				.name("신동준")
				.birth(mdate)
				.job("회사원")
				.hobby("서핑")
				.interest("축구")
				.exposure_yn(0)
				.nickname("지노")
				.build();
		
		User newUser = userRe.save(user);
		log.info(newUser.toString());
		
		
	}

}
