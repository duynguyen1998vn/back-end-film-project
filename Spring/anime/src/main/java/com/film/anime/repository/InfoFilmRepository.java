package com.film.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.anime.entity.InfoFilm;

public interface InfoFilmRepository extends JpaRepository<InfoFilm,Integer>{
	
	InfoFilm findById(int id);
}
