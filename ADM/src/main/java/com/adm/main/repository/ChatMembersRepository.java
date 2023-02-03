package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.dto.ChatMembersDTO;
import com.adm.main.dto.ChattingMessageDTO;
@Repository
public interface ChatMembersRepository extends JpaRepository<ChatMembersDTO, Integer> {


}
