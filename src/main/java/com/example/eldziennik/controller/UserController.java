package com.example.eldziennik.controller;

import com.example.eldziennik.dao.AchievementDao;
import com.example.eldziennik.dao.PupilDao;
import com.example.eldziennik.dao.SubjectDao;
import com.example.eldziennik.domain.Achievement;
import com.example.eldziennik.domain.Pupil;
import com.example.eldziennik.domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    PupilDao pupilDao;
    @Autowired
    SubjectDao subjectDao;
    @Autowired
    AchievementDao achievementDao;

    @GetMapping("/user")
    public String userPage(Model model) {
        Iterable<Pupil> pupils = pupilDao.findAll();
        model.addAttribute("pupils", pupils);
        return "user";
    }
    @GetMapping("/user/{pupilId}")
    public String pupilPage (@PathVariable int pupilId, Model model) {
        Pupil pupil = pupilDao.findPupilById(pupilId);
        List<Subject> subjects = subjectDao.findAll();
        List<Achievement> achievements = achievementDao.findAchievementByIdPupil(pupilId);
        model.addAttribute("pupil", pupil);
        model.addAttribute("subjects", subjects);
        model.addAttribute("achievements", achievements);
        return "pupil";
    }

}
