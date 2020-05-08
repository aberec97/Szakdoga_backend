package com.berec;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.berec.model.Felhasznalo;
import com.berec.model.FelhasznaloService;
import com.berec.model.LoginDataHolder;
import com.berec.model.UserInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class FelhasznaloController {

    @Autowired
    private FelhasznaloService service;

    @CrossOrigin
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Felhasznalo> mindenFelhasznalo() {
		return service.listAll();
    }
    
    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInformation bejelentkezes(@RequestBody LoginDataHolder loginData) throws NoSuchAlgorithmException{

        List<Felhasznalo> users = service.listAll();
        for (Felhasznalo u : users) {
            if (u.getNev().equals(loginData.getName())) {

                HashMaker hashMaker = new HashMaker();
                byte[] hashInBytes = hashMaker.generateHash(loginData.getPassword());
                String hash = hashMaker.bytesToHex(hashInBytes);

                if (u.getJelszo().equals(hash)){

                    UserInformation response = new UserInformation(u.getNev(), u.getEmail(), u.isAdmin());

                    return response;
                }
            }
        }
        return null;
    }
    
}