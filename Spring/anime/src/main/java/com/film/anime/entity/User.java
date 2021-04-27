package com.film.anime.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "account",unique = true,length = 25)
	private String account;
	
	@Column(name = "password",length = 25)
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUser")
	private List<Follow> listFollow;
	
	public User () {}
}
