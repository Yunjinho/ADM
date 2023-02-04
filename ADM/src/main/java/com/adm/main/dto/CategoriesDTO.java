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
@Table(name="categories")

public class CategoriesDTO {
	
	@Id
	int cateid;
	String catename;
	
	@Builder
	public CategoriesDTO(int cateid,String catename) {
		this.cateid = cateid;
		this.catename = catename;
	}

}
