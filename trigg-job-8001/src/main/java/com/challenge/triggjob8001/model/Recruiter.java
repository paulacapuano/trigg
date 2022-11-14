package com.challenge.triggjob8001.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Recruiter {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String jobOpeningDate;
    @ManyToOne
    private List<Applicant> applicant;
}
