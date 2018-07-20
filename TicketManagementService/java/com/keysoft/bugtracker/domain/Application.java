package com.keysoft.bugtracker.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "app")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "app_id")
    private Integer id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000, nullable = false)
    private String description;

    private Integer owner_id;

    public Application() {
    }

    public Application(String name, Integer owner_id,
                       String description) {
        this.id = id;
        this.name = name;
        this.owner_id = owner_id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerId() {
        return owner_id;
    }

    public void setOwnerId(Integer owner) {
        this.owner_id = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner_id +
                ", description='" + description + '\'' +
                '}';
    }
}
