package com.practice.budgettracker.security;

import com.practice.budgettracker.domain.Auser;
import com.practice.budgettracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Auser user = userRepo.findByUsername(username);

        if (user == null)
            throw new UsernameNotFoundException("User doesn't exist");
        return new SecurityUser(user);
    }
}
