package com.practice.budgettracker.repositories;

import com.practice.budgettracker.domain.Auser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Auser, Long> {

    public Auser findByUsername (String username);
}
