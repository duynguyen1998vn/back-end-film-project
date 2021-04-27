package com.film.anime.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.film.anime.entity.EpisodeFilm;
import com.film.anime.entity.InfoFilm;
import com.film.anime.repository.EpisodeFilmRepository;
import com.film.anime.repository.InfoFilmRepository;

@RestController
public class HomeController {
	@Autowired
	private InfoFilmRepository infoFilmRepository;
	
	@Autowired
	private EpisodeFilmRepository episodeRepository;

	
	@PostMapping("/api/v1/data")
	private String insertData() {

		InfoFilm elaina = InfoFilm.builder().name("The Journey of Elaina").status("12/12")
							.image("https://m.media-amazon.com/images/M/MV5BNWI4MGE4MTEtYjFiYS00NmIxLWEyYzYtNTdlYzBjMjI5NjdmXkEyXkFqcGdeQXVyMzgxODM4NjM@._V1_.jpg")
							.category("Comedy")
							.build();
		
		InfoFilm classroom = InfoFilm.builder().name("Classroom Of The Elite").status("12/12")
				.image("https://i.pinimg.com/originals/9e/28/2d/9e282dfe2a9fd76fc3e59ea6631659ed.jpg")
				.category("Drama")
				.build();
		
		
		InfoFilm Daughter = InfoFilm.builder().name("If It's for My Daughter, I'd Even Defeat a Demon Lord").status("12/12")
				.image("https://img.anime2you.de/2019/04/daughter1.jpg")
				.category("Romance")
				.build();
		
		
		InfoFilm hyouka = InfoFilm.builder().name("Hyouka").status("22/22")
				.image("http://images6.fanpop.com/image/photos/33500000/Hyouka-hyouka-33509430-1600-1000.jpg")
				.category("Romance")
				.build();
		
		InfoFilm ao = InfoFilm.builder().name("Ao Chan Can't Study").status("12/12")
				.image("https://animerantshome.files.wordpress.com/2019/06/ao-chan-12-03.png")
				.category("Romance")
				.build();
	
		ArrayList<InfoFilm> listInfoFilm = new ArrayList<InfoFilm>();
		listInfoFilm.add(elaina);
		listInfoFilm.add(classroom);
		listInfoFilm.add(Daughter);
		listInfoFilm.add(hyouka);
		listInfoFilm.add(ao);
		infoFilmRepository.saveAll(listInfoFilm);

		
		EpisodeFilm elaina1 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(1)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina2 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(2)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/gHSvQRejEzM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina3 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(3)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina4 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(4)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina5 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(5)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina6 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(6)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina7 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(7)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina8 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(8)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina9 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(9)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina10 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(10)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina11 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(11)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		EpisodeFilm elaina12 = 
				EpisodeFilm.builder()
				.idFilm(1)
				.episode(12)
				.src("<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/99q74cS0chk\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>")
				.build();
		
		ArrayList<EpisodeFilm> elainaList = new ArrayList<EpisodeFilm>();
		elainaList.add(elaina1);
		elainaList.add(elaina2);
		elainaList.add(elaina3);
		elainaList.add(elaina4);
		elainaList.add(elaina5);
		elainaList.add(elaina6);
		elainaList.add(elaina7);
		elainaList.add(elaina8);
		elainaList.add(elaina9);
		elainaList.add(elaina10);
		elainaList.add(elaina11);
		elainaList.add(elaina12);
		
		episodeRepository.saveAll(elainaList);
		
		EpisodeFilm elite1 = new EpisodeFilm(2,1,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite2 = new EpisodeFilm(2,2,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/vyqR9PTaOHQ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite3 = new EpisodeFilm(2,3,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite4 = new EpisodeFilm(2,4,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite5 = new EpisodeFilm(2,5,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite6 = new EpisodeFilm(2,6,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite7 = new EpisodeFilm(2,7,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite8 = new EpisodeFilm(2,8,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite9 = new EpisodeFilm(2,9,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite10 = new EpisodeFilm(2,10,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite11 = new EpisodeFilm(2,11,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		EpisodeFilm elite12 = new EpisodeFilm(2,12,
				"<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/iTTrFraNlQU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>");
		
		ArrayList<EpisodeFilm> eliteList = new ArrayList<EpisodeFilm>();
		eliteList.add(elite1);
		eliteList.add(elite2);
		eliteList.add(elite3);
		eliteList.add(elite4);
		eliteList.add(elite5);
		eliteList.add(elite6);
		eliteList.add(elite7);
		eliteList.add(elite8);
		eliteList.add(elite9);
		eliteList.add(elite10);
		eliteList.add(elite11);
		eliteList.add(elite12);
		
		episodeRepository.saveAll(eliteList);
		
		return "Insert Done";
	}
	

	
}
