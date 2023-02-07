package com.adm.main.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="gather")
@Builder
public class GatherDTO {
	
	@Id
	int  gatherid;
	String userid;
	String gathername;
	int number_of_member;
	String category;
	String gather_info;
	String img;
	
	@Builder
	public GatherDTO(int gatherid, String userid, String gathername, int number_of_member, String category, String gather_info, String img) {
		this.category = category;
		this.gather_info = gather_info;
		this.gatherid = gatherid;
		this.gathername =gathername ; 
		this.img = img;
		this.number_of_member = number_of_member;
		this.userid = userid;
		
	}
	

	
	
	

}
