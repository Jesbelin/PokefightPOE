package com.PokefightPOE.java.Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pokemons")
public class Pokemons {


    @Column(name = "ID")
    private Integer Id;

    @Id
    @Column(name = "NOM_POKEMON_POK")
    private String nomPokemonPok;

    @Column(name = "POINT_DE_VIE_POK")
    private Integer pointDeViePok;

    public Pokemons(Integer id, String nomPokemonPok, Integer pointDeViePok) {
        Id = id;
        this.nomPokemonPok = nomPokemonPok;
        this.pointDeViePok = pointDeViePok;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNomPokemonPok() {
        return nomPokemonPok;
    }

    public void setNomPokemonPok(String nomPokemonPok) {
        this.nomPokemonPok = nomPokemonPok;
    }

    public Integer getPointDeViePok() {
        return pointDeViePok;
    }

    public void setPointDeViePok(Integer pointDeViePok) {
        this.pointDeViePok = pointDeViePok;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "connaitre",
            joinColumns = @JoinColumn(name = "NOM_POKEMON_POK"),
            inverseJoinColumns = @JoinColumn(name = "NOM_ATTAQUE_AT")
    )
    @JsonManagedReference
    private List<Attaque> attaques;

    public List<Attaque> getAttaques() {
        return attaques;
    }

    public void setAttaques(List<Attaque> attaques) {
        this.attaques = attaques;
    }

    public Pokemons(){

    }

    @Override
    public String toString() {
        return "Pokemons{" +
                "Id=" + Id +
                ", nomPokemonPok='" + nomPokemonPok + '\'' +
                ", pointDeViePok=" + pointDeViePok +
                ", attaques=" + attaques +
                '}';
    }
}