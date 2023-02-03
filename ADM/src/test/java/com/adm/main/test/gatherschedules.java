package com.adm.main.test;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adm.main.dto.DateSchedulesDTO;
import com.adm.main.dto.GatherSchedulesDTO;
import com.adm.main.repository.DateSchedulesRepository;
import com.adm.main.repository.GatherSchedulesRepository;

@SpringBootTest
class gatherschedules {
	
	@Autowired
	GatherSchedulesRepository re;
	@Test
	void contextLoads() {
		GatherSchedulesRepository gather;
		GatherSchedulesDTO gatherDto;
		gatherDto=new GatherSchedulesDTO().builder()
				.userid("이것만")
				.build();
		insert(gatherDto);
	}
	
	void insert(GatherSchedulesDTO g) {
		re.save(g);
	}
	void delete(int pk) {
		re.deleteById(pk);;
	}
	
	void update(GatherSchedulesDTO g) {
		g.setUserid("바꿔요");
		re.save(g);
	}
	Optional<GatherSchedulesDTO> find(int pk) {
		return re.findById(pk);
	}
	List<GatherSchedulesDTO> findall(){
		return re.findAll();
	}
}
