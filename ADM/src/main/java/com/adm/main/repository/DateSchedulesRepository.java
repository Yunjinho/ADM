package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.dto.DateSchedulesDTO;
@Repository
public interface DateSchedulesRepository extends JpaRepository<DateSchedulesDTO, Integer> {

}
