package com.ibd.ibd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibd.ibd.models.Dots;

@Repository
public interface DotsRepository extends JpaRepository<Dots,Long> {
 }
 