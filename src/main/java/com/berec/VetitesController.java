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
import com.berec.model.VetitesService;

@RestController
@RequestMapping(value = "/vetitesek")
public class VetitesController {

	@Autowired
	VetitesService service;
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Vetites> mindenVetites() {
		return service.listAllOrderByIdopont();
	}

	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Vetites vetitesIdSzerint(@PathVariable Integer id) {
		return service.findById(id);
	}

	@CrossOrigin
	@PostMapping(value = "/addvetites")
	public Vetites addVetites(@RequestBody Vetites vetites){
		service.save(vetites);
		return vetites;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void vetitesTorlese(@PathVariable Integer id){
		service.delete(id);
	}
	
	
}
