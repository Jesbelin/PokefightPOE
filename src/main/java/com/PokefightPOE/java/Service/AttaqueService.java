package com.PokefightPOE.java.Service;

import com.PokefightPOE.java.Model.Attaque;
import com.PokefightPOE.java.Repository.AttaqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttaqueService {
    @Autowired
    private AttaqueRepository attaqueRepository;
    public Attaque findByNomAttaqueAt(String attaqueNom) throws Exception {
        if (attaqueRepository.exists(attaqueNom)) {
            return attaqueRepository.findOne(attaqueNom);
        } else {
            throw new Exception("Oups, c'est pas bon!");
        }
    }
}