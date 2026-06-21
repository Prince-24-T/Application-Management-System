package com.prince.ApplicationManagementSystem.Service;

import com.prince.ApplicationManagementSystem.Entity.Applicant;
import com.prince.ApplicationManagementSystem.Entity.Resume;
import com.prince.ApplicationManagementSystem.Repository.ApplicantJpaRepository;
import com.prince.ApplicationManagementSystem.Repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;
    @Autowired
    ResumeRepository resumeRepository;
    public Resume addResume(Long applicantId, Resume resume) {

        Optional<Applicant> applicantOptional = applicantJpaRepository.findById(applicantId);
        if(applicantOptional.isPresent()){
            Applicant applicant = applicantOptional.get();
            resume.setApplicant(applicant);
            return  resumeRepository.save(resume);
        }else {
            throw  new RuntimeException("Application not found with Id :" + applicantId);
        }
    }
}
