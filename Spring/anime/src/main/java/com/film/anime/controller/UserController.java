package com.film.anime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.film.anime.dto.UserDTO;
import com.film.anime.entity.User;
import com.film.anime.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	//Create User
	@CrossOrigin
	@PostMapping("/api/v1/users/{account}/{password}")
	private int insertUser(@PathVariable String account,@PathVariable String password) {
		try {
			User user = User.builder()
							.account(account)
							.password(password)
							.build();
			userRepository.save(user);
			return 1;
		}catch (Exception e) {
			return 0;
		}
	}
	
	//Log In
	@CrossOrigin
	@GetMapping("/api/v1/users/{account}/{password}")
	private UserDTO getUser(@PathVariable String account,@PathVariable String password) {
		User u = userRepository.findByAccountAndPassword(account, password);
		if(u != null) return new UserDTO(u);
		else return null; 
	}
}
