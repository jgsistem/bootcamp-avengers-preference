package com.bootcamp.avengers.model.repository;

import com.bootcamp.avengers.model.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    
}
