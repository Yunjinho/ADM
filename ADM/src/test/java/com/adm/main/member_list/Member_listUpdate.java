package com.adm.main.member_list;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.adm.main.dto.Member_listDTO;
import com.adm.main.repository.Member_listRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class Member_listUpdate {
	@Autowired
	private Member_listRepository mle;
	
	@Test
	void Member_listUpdate() {
		String gmemberid = "wh467925";
		Optional<Member_listDTO> optionalMember_list = mle.findById(gmemberid);
		Member_listDTO member_list = optionalMember_list.get();
		member_list.setNumber_of_member(34);
		mle.save(member_list);
		
		Member_listDTO updateMember_list = mle.findById(gmemberid).get();
		Assertions.assertThat(updateMember_list.getNumber_of_member()).isEqualTo(34);
	}

}
