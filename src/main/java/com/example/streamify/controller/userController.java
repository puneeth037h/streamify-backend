package com.example.streamify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.streamify.models.User;
import com.example.streamify.repo.userRepository;
//import com.example.streamify.models.user;
import com.example.streamify.service.userService;
import com.example.streamify.util.JwtUtil;

@RestController
public class userController {

	@Autowired
	private userService service;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		service.createuser(user);
		return "user Registered successfully";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User loginReq) {
	    User user = service.findByEmail(loginReq.getEmail())
	            .orElseThrow(() -> new UsernameNotFoundException("User not found"));

	    if (!user.getPassword().equals(loginReq.getPassword())) {
	        throw new BadCredentialsException("Invalid credentials");
	    }

	    return JwtUtil.generateToken(user.getEmail());
	}
	@GetMapping("/users")
	public List<User> getallusers(){
		return service.fetchalluser();
	}
}
