package com.bugtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bugtracker.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
