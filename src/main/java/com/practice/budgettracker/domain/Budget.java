package com.practice.budgettracker.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Budget {

    private Long id;
    private String name;
    private Auser user;
    private Set<Auser> users = new HashSet<>();
    private Set<Section> sections = new TreeSet<>();

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToMany
    @JoinTable(inverseJoinColumns=@JoinColumn(name="user_id"), joinColumns=@JoinColumn(name="budget_id"))
    public Set<Auser> getUsers() {
        return users;
    }

    public void setUsers(Set<Auser> users) {
        this.users = users;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "budget")
    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }
}
