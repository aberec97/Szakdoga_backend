package com.berec.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

	List<Film> findAllByMufajMegnevezes(String mufaj);
	
}
