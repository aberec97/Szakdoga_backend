package com.berec;

import java.util.List;

import com.berec.model.Foglalas;
import com.berec.model.FoglalasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reservations")
public class FoglalasController{


    @Autowired
    private FoglalasService service;

    @CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Foglalas> mindenFoglalas() {
		return service.listAll();
    }
    
    @CrossOrigin
	@RequestMapping(value = "/addreservation", method = RequestMethod.POST)
	public Foglalas addFoglalas(@RequestBody Foglalas foglalas){
		service.save(foglalas);
		return foglalas;
    }
    
    @CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Foglalas foglalasIdSzerint(@PathVariable Integer id) {
		return service.findById(id);
    }
    
    @CrossOrigin
	@RequestMapping(value = "/vetites/{id}", method = RequestMethod.GET)
	public List<Foglalas> mindenFoglalas(@PathVariable Integer id) {
		return service.listAllByVetitesId(id);
    }
}