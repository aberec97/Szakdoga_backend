package com.berec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.berec.model.Terem;
import com.berec.model.TeremRepository;

@RestController
@RequestMapping(value = "/rooms")
public class RoomController {
	
	@Autowired
	TeremRepository roomRepo;

	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Terem> mindenTerem() {
		return roomRepo.findAll();
	}
	
	
}
