package com.adm.main.likedTests;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.entity.Liked;
import com.adm.main.repository.LikedRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class LikedUpdateTest {
	
	@Autowired
	private LikedRepository likedRepo;
	
	@Test
	void updateTest() {
		
		int likedId = 1;
		Optional<Liked> optionalLiked = likedRepo.findById(likedId);
		Liked liked = optionalLiked.get();
		liked.setLid("hyejung1234");
		likedRepo.save(liked);
		
		Liked updateLiked = likedRepo.findById(likedId).get();
		Assertions.assertThat(updateLiked.getLid()).isEqualTo("hyejung1234");
			
	}
	
	

}
