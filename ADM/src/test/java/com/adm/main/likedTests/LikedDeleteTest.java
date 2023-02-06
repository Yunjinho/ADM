package com.adm.main.likedTests;

import java.util.Optional;

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
public class LikedDeleteTest {
	
	@Autowired
	private LikedRepository likedRepo;
	
	@Test
	void deleteTest() {
		int likeId = 3;
		likedRepo.deleteById(likeId);
		
		Optional<Liked> optionalLiked = likedRepo.findById(likeId);
		Assertions.assertThat(optionalLiked).isNotPresent();
		
	}

}
