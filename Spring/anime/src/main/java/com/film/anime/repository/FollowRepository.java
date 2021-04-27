package com.film.anime.repository;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.anime.entity.Follow;

public interface FollowRepository extends JpaRepository<Follow,Integer>{
	
	ArrayList<Follow> findAllByIdUser(int id);
	
	Follow findByIdUserAndIdFilm(int idUser,int idFilm);
	
	@Transactional
	void deleteByIdUserAndIdFilm(int idUser,int idFilm);
}
