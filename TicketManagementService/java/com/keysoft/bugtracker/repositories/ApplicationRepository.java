package com.keysoft.bugtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keysoft.bugtracker.domain.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{
}
