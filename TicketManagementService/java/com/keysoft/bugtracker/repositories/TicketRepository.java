package com.keysoft.bugtracker.repositories;

import java.util.List;

import com.keysoft.bugtracker.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    TicketRepository extends JpaRepository<Ticket, Integer> {
}
