package com.prince.ApplicationManagementSystem.Controllers;


import com.prince.ApplicationManagementSystem.Entity.Applicant;
import com.prince.ApplicationManagementSystem.Service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplicants(){
        return  applicantService.getAllApplicants();

    }

    @PostMapping
    public  Applicant saveApplicant(@RequestBody Applicant applicant){

        return  applicantService.saveApplicant(applicant);

    }

    @GetMapping("/byStatus")
    public  List<Applicant> getApplicantByStatus(@RequestBody String status){

        return  applicantService.getApplicantByStatus(status);

    }
    @GetMapping("/byStatusAndName")
    public  List<Applicant> getApplicantByStatusAndName(@RequestBody String status ,@RequestBody String name ){

        return  applicantService.getApplicantByNamAndStatus(status , name);

    }

    @GetMapping("/page")
    public  Iterable<Applicant> getApplicantWithPagination(@RequestParam int page, @RequestParam  int size){

        return  applicantService.getApplicantWithPagination(page , size);


    }
}
