package com.berec.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FelhasznaloService {

    @Autowired
    private FelhasznaloRepository felhasznaloRepo;

    public List<Felhasznalo> listAll() {
        return felhasznaloRepo.findAll();
    }

    public void save(Felhasznalo felhasznalo) {
        felhasznaloRepo.save(felhasznalo);
    }

    public Felhasznalo get(Integer id) {
        return felhasznaloRepo.findById(id).get();
    }

    public void delete(Integer id) {
        felhasznaloRepo.deleteById(id);
    }

}