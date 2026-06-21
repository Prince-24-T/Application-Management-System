package com.prince.ApplicationManagementSystem.Service;

import com.prince.ApplicationManagementSystem.Entity.Applicant;
import com.prince.ApplicationManagementSystem.Repository.ApplicantJpaRepository;
import com.prince.ApplicationManagementSystem.Repository.ApplicationCrudRepository;
import com.prince.ApplicationManagementSystem.Repository.ApplicationPaggingSortingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ApplicantService {

    @Autowired
    private ApplicationCrudRepository applicationCrudRepository;

    @Autowired
    private ApplicationPaggingSortingRepo applicationPaggingSortingRepo;

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;


    public List<Applicant> getApplicantByStatus(String status){
        return  applicantJpaRepository.findByStatus(status);
    }
    public  List<Applicant> getApplicantByNamAndStatus(String status , String name){
        return  applicantJpaRepository.findByNameAndStatus(status , name);
    }

    public List<Applicant> getAllApplicants() {

        Iterable<Applicant> allApplicant = applicationCrudRepository.findAll();
        List<Applicant> list = new ArrayList<>();
        allApplicant.forEach(applicant -> list.add(applicant));
        return  list;

    }

    public Applicant saveApplicant(Applicant applicant) {
       Applicant savedApplicant= applicationCrudRepository.save(applicant);
       return  savedApplicant;

    }

    public  Iterable<Applicant> getApplicantWithPagination(int page , int size){
       return applicationPaggingSortingRepo.findAll(PageRequest.of(page , size));
    }
}
