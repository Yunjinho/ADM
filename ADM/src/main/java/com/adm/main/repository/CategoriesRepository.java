package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.main.dto.CategoriesDTO;

public interface CategoriesRepository extends JpaRepository<CategoriesDTO, Integer> {

}
