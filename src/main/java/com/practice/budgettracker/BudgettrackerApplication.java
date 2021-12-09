package com.practice.budgettracker;

import com.practice.budgettracker.security.UserDetailsServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BudgettrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgettrackerApplication.class, args);
    }

    @Bean
    public UserDetailsServiceImp userDetailsServiceImp() {
        return new UserDetailsServiceImp();
    }

}
