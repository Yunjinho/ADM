package com.adm.main.dto;

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
@Table(name="hate")
@Builder
public class Hate {
	
	@Id
	private int hateid;
	
	private String userid;
	private String hid; // 차단하고 싶은 아이디

}
