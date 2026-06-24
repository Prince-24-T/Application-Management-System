package com.prince.ApplicationManagementSystem.Service;


import com.prince.ApplicationManagementSystem.Entity.Applicant;
import com.prince.ApplicationManagementSystem.Entity.Application;
import com.prince.ApplicationManagementSystem.Repository.ApplicantJpaRepository;
import com.prince.ApplicationManagementSystem.Repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    ApplicationRepository applicationRepository;

    @Autowired
    ApplicantJpaRepository applicantJpaRepository;

    public Application saveApplication( Long applicantId ,Application application ){

        Optional<Applicant> applicant = applicantJpaRepository.findById(applicantId);
        if(applicant.isPresent()){
            Applicant applicant1 = applicant.get();
            application.setApplicant(applicant1);
            applicationRepository.save(application);
        }else{
            throw  new RuntimeException("Applicant not found with Id: "+applicantId);
        }
        return  applicationRepository.save(application);
    }
}
