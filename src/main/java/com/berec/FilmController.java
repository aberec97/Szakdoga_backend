package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Film;
import com.berec.model.FilmService;

@RestController
@Transactional
@RequestMapping(value = "/movies")
public class FilmController {

	@Autowired
	private FilmService service;

	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Film> mindenFilm() {
		return service.listAll();
	}

	@CrossOrigin
	@RequestMapping(value = "/addmovie", method = RequestMethod.POST)
	public Film addMovie(@RequestBody Film film){
		service.save(film);
		return film;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/categories/{mufaj}", method = RequestMethod.GET)
	public List<Film> filmekMufajSzerint(@PathVariable String mufaj) {
		return service.findAllByMufajMegnevezes(mufaj);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Film filmIdSzerint(@PathVariable Integer id) {
		return service.findById(id);
	}
	
}
