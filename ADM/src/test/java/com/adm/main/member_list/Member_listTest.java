package com.adm.main.member_list;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.Member_listDTO;
import com.adm.main.repository.Member_listRepository;

@SpringBootTest
public class Member_listTest {
	@Autowired
	Member_listRepository mle;
	
	@Test
	void contextLoads() {
		Member_listDTO member_list = new Member_listDTO().builder()
				.gatherid(1)
				.gmemberid("wh467925")
				.number_of_member(23)
				.build();
		
		mle.save(member_list);
	}
	
	@Test
	void findAll() {
		List<Member_listDTO> member_list = mle.findAll();
	}
	
//	@Test
//	void delete() {
//		Member_listDTO member_list = mle.findById((String)"wh467925").get();
//		mle.delete(member_list);	
//	}

}
