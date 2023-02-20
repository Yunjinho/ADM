package com.adm.main.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name="user")
@Builder
public class User {
	
	@Id
	private String userid;
	
	private String password;
	private String gender;
	private String address;
	private String profileimg1;
	private String profileimg2;
	private String phone;
	private String email;
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	private String job;
	private String hobby;
	private String interest;
	private int exposure_yn;
	private String nickname;
		

}
