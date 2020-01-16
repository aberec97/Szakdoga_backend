package com.berec.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepo;

    public List<Film> listAll() {
        return filmRepo.findAll();
    }

    public void save(Film film) {
        filmRepo.save(film);
    }

    public Film findById(Integer id) {
        return filmRepo.findById(id).get();
    }

    public void delete(Integer id) {
        filmRepo.deleteById(id);
    }

    public List<Film> findAllByMufajMegnevezes(String mufaj){
        return filmRepo.findAllByMufajMegnevezes(mufaj);
    }

}