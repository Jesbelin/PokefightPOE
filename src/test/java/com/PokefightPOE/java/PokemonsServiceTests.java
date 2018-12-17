package com.PokefightPOE.java;


import com.PokefightPOE.java.Model.Pokemons;
import com.PokefightPOE.java.Service.PokemonsService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PokemonsServiceTests {
    @Autowired
    private PokemonsService pokemonsService;

    @Test
    public void pokemonExist() throws Exception {

        //given
        String nomPokemonPok = "Mew";

        //when
        Pokemons p = pokemonsService.findByNomPokemonPok(nomPokemonPok);


        //then
        Assert.assertTrue(p != null);
        System.out.println(p);
    }

}