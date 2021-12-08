package com.practice.budgettracker.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class Section {
    private Long id;
    private String name;
    private Auser user;
    private Set<Category> categories = new TreeSet<>();

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

    @ManyToOne
    public Auser getUser() {
        return user;
    }

    public void setUser(Auser user) {
        this.user = user;
    }

    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="section")
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
