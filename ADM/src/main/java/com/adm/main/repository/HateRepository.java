package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.entity.Hate;

@Repository
public interface HateRepository extends JpaRepository<Hate, Integer>{

}
