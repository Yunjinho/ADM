package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.entity.Liked;

@Repository
public interface LikedRepository extends JpaRepository<Liked, Integer> {

}
