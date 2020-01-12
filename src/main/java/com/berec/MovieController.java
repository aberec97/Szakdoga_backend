package com.berec;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Film;
import com.berec.model.FilmRepository;

@RestController
@Transactional
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

	@CrossOrigin
	@RequestMapping(value = "/addmovie", method = RequestMethod.POST)
	public Film addMovie(@RequestBody Film film){
		movieRepo.save(film);
		return film;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/categories/{mufaj}", method = RequestMethod.GET)
	public List<Film> filmekMufajSzerint(@PathVariable String mufaj) {
		return movieRepo.findAllByMufajMegnevezes(mufaj);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Film> filmIdSzerint(@PathVariable Integer id) {
		return movieRepo.findById(id);
	}
	
}
