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
public class HateDeleteTest {
	
	@Autowired
	private HateRepository HateRepo;
	
	@Test
	void deleteTest() {
		int hateId = 3;
		HateRepo.deleteById(hateId);
		
		Optional<Hate> optionalHate = HateRepo.findById(hateId);
		Assertions.assertThat(optionalHate).isNotPresent();
		
	}

}
