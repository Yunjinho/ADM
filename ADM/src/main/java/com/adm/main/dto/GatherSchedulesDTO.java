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
@Table(name="gatherschedules")
@Builder
public class GatherSchedulesDTO {
	@Id
	int gschedules_id;
	String userid;
	int gatherid;
	String gcontents;
	Date schedules_gather;
	String gplace;
	@Builder
	public GatherSchedulesDTO(int gschedules_id, String userid, int gatherid, String gcontents, Date schedules_gather,
			String gplace) {
		super();
		this.gschedules_id = gschedules_id;
		this.userid = userid;
		this.gatherid = gatherid;
		this.gcontents = gcontents;
		this.schedules_gather = schedules_gather;
		this.gplace = gplace;
	}
	
	
	

}
