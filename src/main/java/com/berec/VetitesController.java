package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Vetites;
import com.berec.model.VetitesRepository;

@RestController
@RequestMapping(value = "/vetitesek")
public class VetitesController {

	@Autowired
	VetitesRepository vetitesRepo;
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Vetites> mindenFilm() {
		return vetitesRepo.findAll();
	}

	@CrossOrigin
	@PostMapping(value = "/addvetites")
	public Vetites addVetites(@RequestBody Vetites vetites){
		vetitesRepo.save(vetites);
		return vetites;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<Vetites> vetitesByFilm(@PathVariable Integer id){
		return vetitesRepo.findAllByFilmID(id);
	}
	
	
}
