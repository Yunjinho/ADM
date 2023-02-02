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
@Table(name="chat_members")
@Builder
public class ChatMembersDTO {
	@Id
	int gmemberid;
	int chatroomid;
	String userid;
	public ChatMembersDTO(int gmemberid, int chatroomid, String userid) {
		super();
		this.gmemberid = gmemberid;
		this.chatroomid = chatroomid;
		this.userid = userid;
	}
	
	

}
