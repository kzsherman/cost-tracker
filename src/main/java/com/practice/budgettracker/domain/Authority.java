package com.practice.budgettracker.domain;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Authority implements GrantedAuthority {


    private Long id;
    private String authority;
    private Auser user;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @ManyToOne
    public Auser getUser() {
        return user;
    }

    public void setUser(Auser user) {
        this.user = user;
    }
}
