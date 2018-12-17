package com.PokefightPOE.java.Controller;

import com.PokefightPOE.java.Model.Attaque;
import com.PokefightPOE.java.Service.AttaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttaqueController {
    @Autowired
    private AttaqueService attaqueService;

    @RequestMapping("/attaque")
    public Attaque attaque(@RequestParam(value = "nomAttaqueAt") String nomAttaqueAt) throws Exception {
        return attaqueService.findByNomAttaqueAt(nomAttaqueAt);
    }
}