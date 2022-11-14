package com.challenge.triggjob8001.controller;

import com.challenge.triggjob8001.model.Applicant;
import com.challenge.triggjob8001.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("trigg/applicants")
public class ApplicantController {

    @Autowired
    ApplicantRepository applicantRepository;

    @GetMapping
    @Transactional
    public ResponseEntity<List<Applicant>> list() {
        List<Applicant> applicants = applicantRepository.findAll();
        return ResponseEntity.ok().body(applicants);

    }
}
