package com.example.eldziennik.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JoinColumn(name = "pupil_id")
    private int idPupil;
    @JoinColumn(name = "subject_id")
    private int idSubject;
    @Column(nullable = false)
    private Note note;
    private Date date;


    public void setIdPupil(int idPupil) {
        this.idPupil = idPupil;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public int getIdPupil() {
        return idPupil;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public Note getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }
}
