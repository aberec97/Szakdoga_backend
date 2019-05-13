package com.berec.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VetitesRepository  extends JpaRepository<Vetites, Integer>{

	List<Vetites> findAllByFilmID(Integer filmID);
	
}
