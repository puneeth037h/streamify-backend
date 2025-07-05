package com.example.streamify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.streamify.models.user;
import com.example.streamify.repo.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository repo;
	
	public user createuser(user user) {
		return repo.save(user);
	}
}
