package com.adm.main.gather;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.GatherDTO;
import com.adm.main.repository.GatherRepository;

@SpringBootTest
public class GatherTest {
	@Autowired
	GatherRepository ge;

	
	  @Test 
	  void contextLoads() { 
		  GatherDTO gather = new GatherDTO().builder()
				  .gathername("test")
				  .gatherid(2)
				  .userid("wh467925")
				  .number_of_member(45)
				  .category("운동")
				  .gather_info("운동하기싫어요")
				  .img("a.jpg")
				  .build();
	  
	  ge.save(gather);
	  }
	

	@Test
	void finaAll() {
		//전체 리스트 조회
		List<GatherDTO> gather = ge.findAll();
	}

	
	
	  @Test	  
	  void delete() { 
		//삭제
		 GatherDTO gather = ge.findById((int)1).get();
		 ge.delete(gather); 
	  }
	 
	

}
