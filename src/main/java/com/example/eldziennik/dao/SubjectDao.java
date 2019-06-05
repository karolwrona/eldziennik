package com.example.eldziennik.dao;

import com.example.eldziennik.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Integer> {
    List<Subject> findAll();
    String findNameById(int id);
}
