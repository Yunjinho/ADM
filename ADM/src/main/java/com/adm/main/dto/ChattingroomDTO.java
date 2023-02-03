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



@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="chattingroom")
@ToString
@Builder
public class ChattingroomDTO {
	@Id
	int chatroomid;
	String chatroomname;
	Date chattime;
	int chatting_type;
	
	
	@Builder
	public ChattingroomDTO(int chatroomid, String chatroomname, Date chattime, int chatting_type) {
		this.chatroomid = chatroomid;
		this.chatroomname = chatroomname;
		this.chattime = chattime;
		this.chatting_type = chatting_type;
	}
	
	

}