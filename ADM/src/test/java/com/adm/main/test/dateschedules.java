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
class dateschedules {
	
	@Autowired
	DateSchedulesRepository re;
	@Test
	void contextLoads() {
		DateSchedulesDTO dateDto;
		dateDto=new DateSchedulesDTO().builder()
				.userid("이것만")
				.build();
		insert(dateDto);
	}
	
	void insert(DateSchedulesDTO g) {
		re.save(g);
	}
	void delete(int pk) {
		re.deleteById(pk);;
	}
	
	void update(DateSchedulesDTO g) {
		g.setUserid("바꿔요");
		re.save(g);
	}
	Optional<DateSchedulesDTO> find(int pk) {
		return re.findById(pk);
	}
	List<DateSchedulesDTO> findall(){
		return re.findAll();
	}

}
