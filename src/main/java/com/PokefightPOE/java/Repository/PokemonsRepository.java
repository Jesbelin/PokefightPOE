package com.PokefightPOE.java.Repository;

import com.PokefightPOE.java.Model.Pokemons;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PokemonsRepository extends PagingAndSortingRepository <Pokemons, String>{
    //Pokemons findById (Integer Id); //la méthode findById existe déjà dans le PagingAndSortingRepository, donc on en a pas besoin

    /*Pokemons findByNomPokemonPok (String nomPokemonPok);*/
}
