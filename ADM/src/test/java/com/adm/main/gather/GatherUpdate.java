package com.adm.main.gather;


import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.GatherDTO;
import com.adm.main.repository.GatherRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class GatherUpdate {
	@Autowired
	private GatherRepository ge;

	@Test
	void GatherUpdate() {
		int gatherid = 1;
		Optional<GatherDTO> optionalGather = ge.findById(gatherid);
		GatherDTO gather = optionalGather.get();
		gather.setGathername("¿õµ¿");
		ge.save(gather);
		
		GatherDTO updateGather = ge.findById(gatherid).get();
		Assertions.assertThat(updateGather.getGathername()).isEqualTo("¿õµ¿");
	}
}
