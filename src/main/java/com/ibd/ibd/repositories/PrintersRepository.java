package com.ibd.ibd.repositories;

import java.util.List;

import com.ibd.ibd.dto.PrintersData;
import com.ibd.ibd.models.Printers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintersRepository extends JpaRepository<Printers,Long> {
 }
