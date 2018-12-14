package com.PokefightPOE.java.Service;

import com.PokefightPOE.java.Model.Pokemons;
import com.PokefightPOE.java.Repository.PokemonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonsService {
    @Autowired
    private PokemonsRepository pokemonsRepository;
    public Pokemons findByNomPokemonPok(String nomPokemonPok) throws Exception {
        if (pokemonsRepository.exists(nomPokemonPok)) {
            return pokemonsRepository.findOne(nomPokemonPok);
        } else {
            throw new Exception("Oups, c'est pas bon!");
        }
    }
}