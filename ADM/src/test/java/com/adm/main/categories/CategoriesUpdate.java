package com.adm.main.categories;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.CategoriesDTO;
import com.adm.main.repository.CategoriesRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CategoriesUpdate {
	@Autowired
	private CategoriesRepository cr;
	
	@Test
	void CategoriesUpdate() {
		int cateid = 1;
		Optional<CategoriesDTO> optionalcate = cr.findById(cateid);
		CategoriesDTO cate = optionalcate.get();
		cate.setCatename("study");
		cr.save(cate);
		
		CategoriesDTO updateCate = cr.findById(cateid).get();
		Assertions.assertThat(updateCate.getCatename()).isEqualTo("study");
	}
}
