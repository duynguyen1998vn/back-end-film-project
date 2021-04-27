package com.film.anime.dto;

import com.film.anime.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	
	private int id;
	private String account;
	
	public UserDTO(User user) {
		
		this.id = user.getId();
		this.account = user.getAccount();
	}
}
