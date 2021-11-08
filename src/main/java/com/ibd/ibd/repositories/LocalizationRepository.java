package com.ibd.ibd.repositories;

import com.ibd.ibd.models.Localization;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizationRepository extends JpaRepository<Localization,Long> {
    
}
