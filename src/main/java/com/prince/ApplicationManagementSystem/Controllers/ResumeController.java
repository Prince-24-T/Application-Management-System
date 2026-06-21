package com.prince.ApplicationManagementSystem.Controllers;

import com.prince.ApplicationManagementSystem.Entity.Resume;
import com.prince.ApplicationManagementSystem.Service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @PostMapping("/resume/{applicantId}")
    public ResponseEntity<Resume> addResume(@PathVariable Long applicantId, @RequestBody Resume resume){
        return   ResponseEntity.ok(resumeService.addResume(applicantId , resume));
    }


}
