package com.practice.budgettracker.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Auser {
    private Long id;
    private String username;
    private String password;
    private Set<Section> sections = new TreeSet<>();

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(cascade= CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")
    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }
}
