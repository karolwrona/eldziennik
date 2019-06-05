package com.example.eldziennik.domain;

import javax.persistence.*;


@Entity
@Table
public class Pupil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    private int age;
    private String classMark;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassMark() {
        return classMark;
    }

    public void setClassMark(String classMark) {
        this.classMark = classMark;
    }
}
