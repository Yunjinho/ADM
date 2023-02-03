package com.adm.main.hateTests;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.Hate;
import com.adm.main.repository.HateRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class HateUpdateTest {
	
	@Autowired
	private HateRepository hateRepo;
	
	@Test
	void updateTest() {
		
		int hateId = 2;
		Optional<Hate> optionalHate = hateRepo.findById(hateId);
		Hate hate = optionalHate.get();
		hate.setHid("hannah1234");
		hateRepo.save(hate);
		
		Hate updateHate = hateRepo.findById(hateId).get();
		Assertions.assertThat(updateHate.getHid()).isEqualTo("hannah1234");
			
	}
	
	

}
