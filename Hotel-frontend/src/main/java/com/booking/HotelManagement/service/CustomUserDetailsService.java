package com.booking.HotelManagement.service;

import com.booking.HotelManagement.entity.User;
import com.booking.HotelManagement.exception.OurException;
import com.booking.HotelManagement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        System.out.println("Loaded password from DB: " + user.getPassword());

        return userRepository.findByEmail(username).orElseThrow(()-> new OurException("Username/Email not found"));
//        User user = userRepository.findByEmail(username).orElseThrow(()-> new OurException("Username/Email not found"));
//        return new org.springframework.security.core.userdetails.User(
//                user.getEmail(),
//                user.getPassword(),
//                List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
//        );
    }
}
