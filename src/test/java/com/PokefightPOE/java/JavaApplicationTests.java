package com.PokefightPOE.java;

import com.PokefightPOE.java.Model.Attaque;
import com.PokefightPOE.java.Model.Pokemons;
import com.PokefightPOE.java.Repository.AttaqueRepository;
import com.PokefightPOE.java.Repository.PokemonsRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private PokemonsRepository pokemonsRepository;

	@Autowired
	private AttaqueRepository attaqueRepository;

	@Test
	public void testConnexionBdd() {
		/*//When
		long nbPokemons = pokemonsRepository.count();

		//Then
		Assert.assertTrue((nbPokemons > 0));*/

		Pokemons p = pokemonsRepository.findByNomPokemonPok("Mew");
		List<Attaque> list = p.getAttaques();
		System.out.println(list);
	}
}