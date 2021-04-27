package com.film.anime.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.film.anime.entity.Follow;
import com.film.anime.entity.InfoFilm;
import com.film.anime.repository.FollowRepository;
import com.film.anime.repository.InfoFilmRepository;
import com.film.anime.repository.UserRepository;

@RestController
public class FollowController {
	
	@Autowired
	private FollowRepository followRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private InfoFilmRepository infoFilmRepository;
	
	//Call When Click Button Follow Film
	@CrossOrigin
	@PostMapping("/api/v1/follows/{idUser}/{idFilm}")
	private void saveFollow(@PathVariable String idFilm,@PathVariable String idUser) {
			int userId = Integer.parseInt(idUser);
			int filmId = Integer.parseInt(idFilm);
		
			Follow follow = Follow.builder()
									.idFilm(filmId)
									.idUser(userId)
									.build();
			
			if(followRepository.findByIdUserAndIdFilm(userId,filmId) != null ) return;
			else followRepository.save(follow);
			

	}
	
	@CrossOrigin
	@DeleteMapping("/api/v1/follows/{idUser}/{idFilm}")
	private void deleteFollow(@PathVariable String idFilm,@PathVariable String idUser) {
		followRepository.deleteByIdUserAndIdFilm(Integer.parseInt(idUser),Integer.parseInt(idFilm));
	}
	
	@CrossOrigin
	@GetMapping("/api/v1/follows/{idUser}")
	private ArrayList<InfoFilm> getFollow(@PathVariable String idUser) {	
		ArrayList<InfoFilm> result = new ArrayList<InfoFilm>();
	
		List<Follow> arrFollow =  userRepository.findById(Integer.parseInt(idUser)).getListFollow();
		arrFollow.forEach(follow -> result.add(infoFilmRepository.findById(follow.getIdFilm())));
		
		return result;
	}
	
}
