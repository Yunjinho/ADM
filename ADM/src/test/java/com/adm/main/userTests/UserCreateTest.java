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
	
	String  day = "1994-11-12"; 
	java.sql.Date mdate = java.sql.Date.valueOf(day);
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	void createTest() {
		User user = 
				User.builder()
					.userid("hyejung1234")
					.password("7777")
					.gender("여자")
					.address("강북구")
					.profileimg1("q.jpg")
					.profileimg2("z.jpg")
					.phone("01066667777")
					.email("hyejung1234@gmail.com")
					.name("박혜정")
					.birth(mdate)
					.job("회사원")
					.hobby("산책")
					.interest("고양이")
					.exposure_yn(1)
					.nickname("혜정")
					.build();
		
		User saveUser = userRepo.save(user);
		
		Assertions.assertThat(saveUser).isNotNull();
		Assertions.assertThat(saveUser.getUserid()).isGreaterThan(null);

	}

}
