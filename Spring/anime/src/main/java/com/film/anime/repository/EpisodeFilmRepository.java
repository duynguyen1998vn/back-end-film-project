package com.film.anime.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.anime.entity.EpisodeFilm;

public interface EpisodeFilmRepository extends JpaRepository<EpisodeFilm, Integer>{
	
	
	EpisodeFilm findByIdFilmAndEpisode(int idFilm,int ep) ;
	ArrayList<EpisodeFilm> findAllByIdFilm(int id);
}
