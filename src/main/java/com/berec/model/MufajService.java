package com.berec.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MufajService {

    @Autowired
    private MufajRepository mufajRepo;

    public List<Mufaj> listAll() {
        return mufajRepo.findAll();
    }

    public void save(Mufaj mufaj) {
        mufajRepo.save(mufaj);
    }

    public Mufaj get(Integer id) {
        return mufajRepo.findById(id).get();
    }

    public void delete(Integer id) {
        mufajRepo.deleteById(id);
    }
}