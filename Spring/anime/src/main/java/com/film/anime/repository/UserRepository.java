package com.film.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.anime.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	User findByAccountAndPassword(String ac,String pas);
	User findById(int id);
}
