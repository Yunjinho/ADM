package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adm.main.dto.AlbumDTO;

public interface AlbumRepository extends JpaRepository<AlbumDTO, Integer> {

}
