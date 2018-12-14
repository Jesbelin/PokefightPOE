package com.PokefightPOE.java.Repository;

import com.PokefightPOE.java.Model.Attaque;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AttaqueRepository extends PagingAndSortingRepository <Attaque, String>{
    //entre chevrons, on marque le nome de l'entité, le type de la clé primaire de la table

    /*List<Attaque> findByNomAttaqueAt (String nomAttaqueAt);*/
    /*Attaque findByNomAttaqueAt (String nomAttaqueAt);*/
}