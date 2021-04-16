package com.bootcamp.avengers.model.repository;

import com.bootcamp.avengers.model.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    @Query("select a from Preference a where a.idCategory = ?1")
    List<Preference> findAllByCategory(Long idCategory);
}
