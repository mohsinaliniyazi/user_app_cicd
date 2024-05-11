package com.userapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userapplication.model.User;
import com.userapplication.repository.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/all")
	public List<User> allAccess() {
		return userRepository.findAll();
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public List<User> moderatorAccess() {
		return userRepository.findAll();
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> adminAccess() {
		return userRepository.findAll();
	}
	
}
