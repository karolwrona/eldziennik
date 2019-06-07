package com.example.eldziennik.dao;

import com.example.eldziennik.domain.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchievementDao extends JpaRepository<Achievement, Integer> {
    List<Achievement> findAll();
    List<Achievement> findAchievementByIdPupil(int idPupil);
}
