package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.adm.main.dto.ChattingroomDTO;
@Repository
public interface ChattingroomRepository extends JpaRepository<ChattingroomDTO, Integer> {
	 
}
