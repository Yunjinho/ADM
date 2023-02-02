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
@Table(name="chattingmessage")
@Builder
public class ChattingMessageDTO {
	@Id
	int messageid;
	int chatroomid;
	Date send_date;
	String userid;
	String message;
	
	public ChattingMessageDTO(int messageid, int chatroomid, Date send_date, String userid, String message) {
		super();
		this.messageid = messageid;
		this.chatroomid = chatroomid;
		this.send_date = send_date;
		this.userid = userid;
		this.message = message;
	}
	

}
