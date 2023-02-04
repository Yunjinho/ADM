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
public class HateFindAllTest {
	
	@Autowired
	private HateRepository hateRepo;
	
	@Test
	void findAllTest() {
		Iterable<Hate> hates = hateRepo.findAll();
		Assertions.assertThat(hates).hasSizeGreaterThan(0);
		
		for (Hate hate : hates) {
			System.out.println(hate);
		}
		
	}
	
	

}
