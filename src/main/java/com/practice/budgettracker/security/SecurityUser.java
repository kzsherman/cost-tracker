package com.practice.budgettracker.security;

import com.practice.budgettracker.domain.Auser;
import com.practice.budgettracker.domain.Authority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import java.util.Set;

public class SecurityUser extends Auser implements UserDetails {

    public SecurityUser() {}

    public SecurityUser(Auser user) {
        this.setAuthorities(user.getAuthorities());
        this.setBudgets(user.getBudgets());
        this.setId(user.getId());
        this.setPassword(user.getPassword());
        this.setUsername(user.getUsername());
    }

    @Override
    public Set<Authority> getAuthorities() {
        return super.getAuthorities();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
