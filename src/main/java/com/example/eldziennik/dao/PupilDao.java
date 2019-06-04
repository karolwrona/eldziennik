package com.example.eldziennik.dao;

import com.example.eldziennik.domain.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PupilDao extends JpaRepository<Pupil, Integer> {

}
