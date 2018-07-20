package com.keysoft.bugtracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.keysoft.bugtracker.domain.Ticket;

@RepositoryRestResource(path = "bug")
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	@RestResource(path = "descriptionIgnoreCaseContaining", rel = "descriptionIgnoreCaseContaining")
	public List<Ticket> findByDescriptionIgnoreCaseContaining(@Param("description") String description);

	@RestResource(path = "findByApplicationId", rel = "findByApplicationId")
	public List<Ticket> findByApplicationId(@Param("appId") Integer appId);

	@RestResource(path = "titleIgnoreCaseContaining", rel = "titleIgnoreCaseContaining")
	public List<Ticket> findByTitleIgnoreCaseContaining(@Param("title") String title);

}
