package com.example.eldziennik.dao;

import com.example.eldziennik.domain.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilDao extends JpaRepository<Pupil, Integer> {
    List<Pupil> findAll();
    Pupil findPupilById(int id);
}
