package com.adm.main.likedTests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.Liked;
import com.adm.main.repository.LikedRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class LikedCreateTest {
	
	@Autowired
	private LikedRepository likedRepo;
	
	@Test
	void createTest() {
		Liked liked = 
				Liked.builder()
				.likeid(3)
				.userid("jino1234")
				.lid("ehdwns8467")
				.build();
				
		Liked saveLiked = likedRepo.save(liked);
		
		Assertions.assertThat(saveLiked).isNotNull();
		Assertions.assertThat(saveLiked.getLikeid()).isGreaterThan(0);

	}

}
