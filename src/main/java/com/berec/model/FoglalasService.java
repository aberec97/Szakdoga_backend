package com.berec.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoglalasService {

    @Autowired
    private FoglalasRepository foglalasRepo;

    public List<Foglalas> listAll() {
        return foglalasRepo.findAll();
    }

    public void save(Foglalas foglalas) {
        foglalasRepo.save(foglalas);
    }

    public Foglalas findById(Integer id) {
        return foglalasRepo.findById(id).get();
    }

    public void delete(Integer id) {
        foglalasRepo.deleteById(id);
    }

    public List<Foglalas> listAllByVetitesId(Integer id) {
        return foglalasRepo.findAllByVetitesID(id);
    }
}