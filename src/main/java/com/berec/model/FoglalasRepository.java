package com.berec.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoglalasRepository extends JpaRepository<Foglalas, Integer>{
    
    List<Foglalas> findAllByVetitesID(Integer id);

}