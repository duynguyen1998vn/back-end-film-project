package com.film.anime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name ="EpisodeFilm")
public class EpisodeFilm {
	
	public EpisodeFilm(int id, int ep, String src) {
		this.idFilm = id;
		this.episode = ep;
		this.src = src;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "idFilm")
	private int idFilm;
	
	@Column(name = "episode")
	private int episode;
	
	@Column(name = "src")
	private String src;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "foreign_key")
	private InfoFilm infoFilm;
}
