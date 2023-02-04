package com.adm.main.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="member_list")
public class Member_listDTO {
	
	@Id
	String gmemberid;
	int gatherid;
	int number_of_member;
	
	@Builder
	public Member_listDTO(String gmemberid, int gatherid, int number_of_member) {
		this.gatherid = gatherid;
		this.gmemberid = gmemberid;
		this.number_of_member = number_of_member;
	}

}
