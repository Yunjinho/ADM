package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.dto.GatherSchedulesDTO;
@Repository
public interface GatherSchedulesRepository extends JpaRepository<GatherSchedulesDTO, Integer> {

}
