package com.adm.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adm.main.dto.GatherDTO;

@Repository
public interface GatherRepository extends JpaRepository<GatherDTO, Integer> {
}
