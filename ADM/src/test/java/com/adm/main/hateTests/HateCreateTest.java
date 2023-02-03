package com.adm.main.hateTests;

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
public class HateCreateTest {
	
	@Autowired
	private HateRepository hateRepo;
	
	@Test
	void createTest() {
		Hate hate = 
				Hate.builder()
					.hateid(3)
					.userid("hannah1234")
					.hid("jkm9874")
					.build();
	
		Hate saveHate = hateRepo.save(hate);
		
		Assertions.assertThat(saveHate).isNotNull();
		Assertions.assertThat(saveHate.getHateid()).isGreaterThan(0);

	}

}
