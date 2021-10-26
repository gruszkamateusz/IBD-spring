package com.ibd.ibd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibd.ibd.models.Printouts;

@Repository
public interface PrintoutsRepository extends JpaRepository<Printouts,Long> {
 }