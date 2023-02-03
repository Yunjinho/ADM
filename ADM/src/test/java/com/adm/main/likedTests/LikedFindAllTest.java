package com.adm.main.likedTests;

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
public class LikedFindAllTest {
	
	@Autowired
	private LikedRepository likedRepo;
	
	@Test
	void findAllTest() {
		Iterable<Liked> likeds = likedRepo.findAll();
		Assertions.assertThat(likeds).hasSizeGreaterThan(0);
		
		for (Liked liked : likeds) {
			System.out.println(liked); 
		}
		
	}
	
	

}
