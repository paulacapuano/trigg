package com.challenge.triggjob8001.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Applicant {

    @Id
    private String id;
    private String name;
    private String opening;
    private String birthdate;

    public Applicant() {
    }

    public Applicant(String name, String opening, String birthdate) {
        this.name = name;
        this.opening = opening;
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOpening() {
        return opening;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
