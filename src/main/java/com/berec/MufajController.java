package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Mufaj;
import com.berec.model.MufajService;

@RestController
@RequestMapping(value = "/categories")
public class MufajController {

	@Autowired
	private MufajService service;
	
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Mufaj> allCategories() {
		return service.listAll();
	}

	@CrossOrigin
	@PostMapping(value = "/addcategory")
	public Mufaj addCategory(@RequestBody Mufaj mufaj){
		service.save(mufaj);
		return mufaj;
	}
	
}
