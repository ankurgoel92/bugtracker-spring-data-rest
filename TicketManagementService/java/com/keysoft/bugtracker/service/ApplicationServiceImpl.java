package com.keysoft.bugtracker.service;

import com.keysoft.bugtracker.domain.Application;
import com.keysoft.bugtracker.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import com.keysoft.bugtracker.domain.Person;
import java.util.List;
import java.util.ArrayList;

public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> listApplications() {
        return applicationRepository.findAll();
    }

}
