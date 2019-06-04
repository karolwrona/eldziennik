package com.example.eldziennik.controller;

import com.example.eldziennik.dao.PupilDao;
import com.example.eldziennik.domain.Pupil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {
    @Autowired
    PupilDao pupilDao;

    @GetMapping("/admin")
    public String adminPage() {
            return "admin";
        }

    @GetMapping("admin/addpupil")
    public String addPupil(Model model) {
        model.addAttribute("pupil", new Pupil());
        return "addpupil";
    }

    @PostMapping("admin/pupilsave")
    public String pupilSave(Pupil pupil, Model model) {
        pupilDao.save(pupil);
        return"success";
    }
}
