package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Film;
import com.berec.model.FilmRepository;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	private FilmRepository movieRepo;
	
	@Autowired
	public MovieController(FilmRepository movieRepo) {
		this.movieRepo = movieRepo;
	}

	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Film> mindenFilm() {
		return movieRepo.findAll();
	}
	
	@RequestMapping(value = "/categories/{mufaj}", method = RequestMethod.GET)
	public List<Film> filmekMufajSzerint(@PathVariable String mufaj) {
		return movieRepo.findAllByMufajMegnevezes(mufaj);
	}
	
	
	
}
