package com.PokefightPOE.java.Controller;

import com.PokefightPOE.java.Model.Pokemons;
import com.PokefightPOE.java.Service.PokemonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonsController {
    @Autowired
    PokemonsService pokemonsService;

    private static final String template = "Les attaques de : %s sont: ";

    @RequestMapping("/pokemons")
    public Pokemons pokemons(@RequestParam(value="nomPokemonPok") String nomPokemonPok) throws Exception {
        return pokemonsService.findByNomPokemonPok(nomPokemonPok);
    }
}