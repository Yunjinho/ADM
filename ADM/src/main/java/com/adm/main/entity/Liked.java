package com.adm.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="liked")
@Builder
public class Liked {
	
	@Id
	private int likeid;
	
	private String userid;
	private String lid; // 호감으로 선택한 아이디

}
