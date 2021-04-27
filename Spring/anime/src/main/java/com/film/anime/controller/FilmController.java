package com.film.anime.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.film.anime.entity.EpisodeFilm;
import com.film.anime.entity.InfoFilm;
import com.film.anime.repository.EpisodeFilmRepository;
import com.film.anime.repository.InfoFilmRepository;

@RestController
public class FilmController {
	
	@Autowired
	private InfoFilmRepository infoFilmRepository;
	
	@Autowired
	private EpisodeFilmRepository episodeRepository;

	@CrossOrigin
	@GetMapping("/api/v1/films")
		private List<InfoFilm> getListFilm() {	
		
			return infoFilmRepository.findAll();
	}
	

	@CrossOrigin
	@GetMapping("/api/v1/films/{idFilm}/{episode}")
	private EpisodeFilm getInfo(@PathVariable String idFilm,@PathVariable String episode) {	
			
			return episodeRepository.findByIdFilmAndEpisode(Integer.parseInt(idFilm),Integer.parseInt(episode));
	}
	
	
	@CrossOrigin
	@GetMapping("/api/v1/images")
		private ArrayList<String> randomImage() {
		
		List<InfoFilm> listFilm = infoFilmRepository.findAll();
		ArrayList<String> randomImg = new ArrayList<String>();
		listFilm.forEach(film -> randomImg.add(film.getImage()));
		
		return randomImg;
	
	}
}
