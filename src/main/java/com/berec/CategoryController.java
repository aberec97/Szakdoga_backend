package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Mufaj;
import com.berec.model.MufajRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	private MufajRepository categoryRepo;
	
	@Autowired
	public CategoryController(MufajRepository categoryRepo) {
		this.categoryRepo = categoryRepo;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Mufaj> allCategories() {
		return categoryRepo.findAll();
	}
	
}
