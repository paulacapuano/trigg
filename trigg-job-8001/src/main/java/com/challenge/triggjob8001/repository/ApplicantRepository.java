package com.challenge.triggjob8001.repository;

import com.challenge.triggjob8001.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicantRepository  extends JpaRepository<Applicant, String> {
    @Query("SELECT a FROM Applicant a ORDER BY birthdate DESC")
    List<Applicant> orderApplicantsByAge();
}
