package com.adm.main;

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
public class CreateTest {
	
	String  day = "1996-01-05"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void create() {
		User user = 
				User.builder()
					.userid("ehdwns8467")
					.password("4567")
					.gender("남자")
					.address("김해시")
					.profileimg1("b.jpg")
					.profileimg2("c.jpg")
					.phone("01096612441")
					.email("hi@gmail.com")
					.name("신동준")
					.birth(mdate)
					.job("회사원")
					.hobby("음식")
					.interest("축구")
					.exposure_yn(0)
					.nickname("동주니")
					.build();
		
		User saveUser = userRepo.save(user);
		
		Assertions.assertThat(saveUser).isNotNull();
		Assertions.assertThat(saveUser.getUserid()).isGreaterThan(null);
	}

}
