package com.example.eldziennik.controller;

import com.example.eldziennik.dao.AchievementDao;
import com.example.eldziennik.dao.PupilDao;
import com.example.eldziennik.dao.SubjectDao;
import com.example.eldziennik.domain.Achievement;
import com.example.eldziennik.domain.Note;
import com.example.eldziennik.domain.Pupil;
import com.example.eldziennik.domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class AdminController {
    @Autowired
    PupilDao pupilDao;
    @Autowired
    SubjectDao subjectDao;
    @Autowired
    AchievementDao achievementDao;

    @GetMapping("/admin")
    public String adminPage() {
            return "admin";
        }

    @GetMapping("/admin/addpupil")
    public String addPupil(Model model) {
        model.addAttribute("pupil", new Pupil());
        return "addpupil";
    }

    @PostMapping("/admin/pupilsave")
    public String pupilSave(Pupil pupil, Model model) {
        pupilDao.save(pupil);
        return"success";
    }

    @GetMapping("/admin/addsubject")
    public String addSubject(Model model) {
        model.addAttribute("subject", new Subject());
        return "addsubject";
    }

    @PostMapping("/admin/subjectsave")
    public String subjectSave(Subject subject, Model model) {
        subjectDao.save(subject);
        return "success";
    }

    @GetMapping("/admin/addachievement")
    public String addAchievement(Model model) {
        List<Pupil> pupils = pupilDao.findAll();
        List<Subject> subjects = subjectDao.findAll();
        model.addAttribute("pupils", pupils);
        model.addAttribute("subjects", subjects);
        model.addAttribute("notes", Note.values());
        model.addAttribute("achievement", new Achievement());
        return "addachievement";
    }

    @PostMapping("/admin/achievementsave")
    public String achevementSave(Achievement achievement, Model model) {
        achievementDao.save(achievement);
        return "success";
    }

}
