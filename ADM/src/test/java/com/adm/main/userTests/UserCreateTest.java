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
	
	String  day = "1998-01-05"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void createTest() {
		User user = 
				User.builder()
					.userid("ehdwns8467")
					.password("1234")
					.gender("남자")
					.address("동작구")
					.profileimg1("a.jpg")
					.profileimg2("b.jpg")
					.phone("01096612441")
					.email("ehdwns8467@gmail.com")
					.name("신동준")
					.birth(mdate)
					.job("회사원")
					.hobby("축구")
					.interest("음식")
					.exposure_yn(0)
					.nickname("동준")
					.build();
		
		User saveUser = userRepo.save(user);
		
		Assertions.assertThat(saveUser).isNotNull();
		Assertions.assertThat(saveUser.getUserid()).isGreaterThan(null);

	}

}
