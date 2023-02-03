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
public class HateGetTest {
	
	@Autowired
	private HateRepository hateRepo;
	
	@Test
	void getTest() {
		int hateId = 1;
		Optional<Hate> optionalHate = hateRepo.findById(hateId);
		Assertions.assertThat(optionalHate).isPresent();
		System.out.println(optionalHate.get());
		
	}
	

}
