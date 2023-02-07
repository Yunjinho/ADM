package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.main.dto.Member_listDTO;

public interface Member_listRepository extends JpaRepository<Member_listDTO, String> {

}
