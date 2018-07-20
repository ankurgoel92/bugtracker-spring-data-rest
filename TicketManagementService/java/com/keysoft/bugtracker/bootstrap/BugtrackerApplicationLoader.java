package com.keysoft.bugtracker.bootstrap;

import com.keysoft.bugtracker.domain.Person;
import com.keysoft.bugtracker.repositories.ApplicationRepository;
import com.keysoft.bugtracker.repositories.PersonRepository;
import com.keysoft.bugtracker.repositories.TicketRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.keysoft.bugtracker.domain.Application;
import com.keysoft.bugtracker.domain.Ticket;


@Component
public class BugtrackerApplicationLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ApplicationRepository applicationRepository;
    private TicketRepository ticketRepository;
    private PersonRepository personRepository;

    private Logger log = Logger.getLogger(BugtrackerApplicationLoader.class);

    @Autowired
    public void setApplicationRepository(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Autowired
    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //create People
        Person person1 = new Person("Mary", "Richards");
        Person person2 = new Person("Toya", "Stewart");
        Person person3 = new Person("Jeff", "Stone");
        Person person4 = new Person("Dean", "Toms");

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person4);

        Application app1 = new Application( "Bug Tracker", person1.getId(),"An app to track defects.");
        Application app2 = new Application("Project Tracker", person2.getId(),"An app to track project management tasks.");
        applicationRepository.save(app1);
        applicationRepository.save(app2);

        log.info("Saved App - id: " + app1.getId());
        log.info("Saved App - id: " + app2.getId());

        Ticket tick1 = new Ticket("Add the ability to sort by release date", "The users need this new feature", app1.getId(), person3.getId());
        Ticket tick2 = new Ticket("Updates are not saved correctly to task name", "This is a bug impacting this feature in production", app2.getId(), person4.getId());

        ticketRepository.save(tick1);
        ticketRepository.save(tick2);

        log.info("Saved Ticket id: " + tick1.getId());
        log.info("Saved Ticket id: " + tick2.getId());
    }
}
