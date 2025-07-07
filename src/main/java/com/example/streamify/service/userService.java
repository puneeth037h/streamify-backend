package com.example.streamify.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.streamify.models.User;
import com.example.streamify.repo.userRepository;

@Service
public class userService {

    @Autowired
    private userRepository repo;

    public User createuser(User user) {
        return repo.save(user);
    }

    public List<User> fetchalluser() {
        return repo.findAll();
    }

    // ✅ Add this method to find a user by email
    public Optional<User> findByEmail(String email) {
        return repo.findByEmail(email);
    }
}
