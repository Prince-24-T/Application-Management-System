package com.prince.ApplicationManagementSystem.Controllers;

import com.prince.ApplicationManagementSystem.Entity.Application;
import com.prince.ApplicationManagementSystem.Service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/application")
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;


    @PostMapping("/{applicantId}")
    public Application saveApplication(@PathVariable("applicantId") Long applicantId , @RequestBody Application application){

        return applicationService.saveApplication(applicantId , application);
    }
}
