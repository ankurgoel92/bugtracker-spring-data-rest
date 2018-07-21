package com.bugtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bugtracker.domain.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
