package com.PokefightPOE.java.Repository;

import com.PokefightPOE.java.Model.Attaque;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AttaqueRepository extends PagingAndSortingRepository <Attaque, Integer>{
    List<Attaque> findByNomAttaqueAt (String nomAttaqueAt);
}