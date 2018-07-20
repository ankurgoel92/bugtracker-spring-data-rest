package com.keysoft.bugtracker.web;

import com.keysoft.bugtracker.domain.Application;
import com.keysoft.bugtracker.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class TzaController {
    private ApplicationService applicationService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    public List<Application> getApplications() {
        return applicationService.listApplications();
    }
}
