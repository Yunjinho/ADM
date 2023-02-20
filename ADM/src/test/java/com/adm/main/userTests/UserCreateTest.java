package com.adm.main.userTests;

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
public class UserCreateTest {
	
	String  day = "1994-11-05"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void createTest() {
		User user = 
				User.builder()
					.userid("hannah123")
					.password("4321")
					.gender("여자")
					.address("관악구")
					.profileimg1("c.jpg")
					.profileimg2("d.jpg")
					.phone("01012345678")
					.email("hannah1234@gmail.com")
					.name("조한나")
					.birth(mdate)
					.job("개발자")
					.hobby("산책")
					.interest("영화")
					.exposure_yn(0)
					.nickname("힌나")
					.build();
		
		User saveUser = userRepo.save(user);
		
		Assertions.assertThat(saveUser).isNotNull();
		Assertions.assertThat(saveUser.getUserid()).isGreaterThan(null);

	}

}
