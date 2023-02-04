package com.adm.main.categories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.CategoriesDTO;
import com.adm.main.repository.CategoriesRepository;

@SpringBootTest
public class CategoriesTest {
	@Autowired
	CategoriesRepository cr;
	
	@Test
	void contextLodas() {
		CategoriesDTO cate = new CategoriesDTO().builder()
				.cateid(1)
				.catename("¿îµ¿")
				.build();
		
		cr.save(cate);
	}
	
	@Test
	void findAll() {
		List<CategoriesDTO> cate = cr.findAll();
		}
	
//	@Test
//	void delete() {
//		CategoriesDTO cate = cr.findById((int)1).get();
//		cr.delete(cate);
//	}
}
