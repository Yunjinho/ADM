package com.adm.main.dto;

import java.util.Date;

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
@Table(name="dateschedules")
@Builder
public class DateSchedulesDTO {
	@Id
	int dschedules_id;
	String userid;
	String did;
	String dcontents;
	Date Schedules_date;
	String dplace;
	
	@Builder
	public DateSchedulesDTO(int dschedules_id, String userid, String did, String dcontents, Date schedules_date,
			String dplace) {
		super();
		this.dschedules_id = dschedules_id;
		this.userid = userid;
		this.did = did;
		this.dcontents = dcontents;
		Schedules_date = schedules_date;
		this.dplace = dplace;
	}


	

}
