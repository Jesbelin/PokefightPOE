package com.PokefightPOE.java.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attaque")
public class Attaque {


        @Column(name = "ID_AT")
        private Integer IdAt;

        @Id
        @Column(name = "NOM_ATTAQUE_AT") // pas nécessaire si on garde la même mise en forme de nom de colonne
        private String nomAttaqueAt;

        @Column(name = "PUISSANCE_AT")
        private Integer puissanceAT;

        public Attaque(Integer idAt, String nomAttaqueAt, Integer puissanceAT) {
                IdAt = idAt;
                this.nomAttaqueAt = nomAttaqueAt;
                this.puissanceAT = puissanceAT;
        }

        public Integer getIdAt() {
                return IdAt;
        }

        public void setIdAt(Integer idAt) {
                IdAt = idAt;
        }

        public String getNomAttaqueAt() {
                return nomAttaqueAt;
        }

        public void setNomAttaqueAt(String nomAttaqueAt) {
                this.nomAttaqueAt = nomAttaqueAt;
        }

        public Integer getPuissanceAT() {
                return puissanceAT;
        }

        public void setPuissanceAT(Integer puissanceAT) {
                this.puissanceAT = puissanceAT;
        }

        @ManyToMany (fetch = FetchType.EAGER)
        @JoinTable(name = "connaitre",
                joinColumns = @JoinColumn(name = "NOM_ATTAQUE_AT"),
                inverseJoinColumns = @JoinColumn(name = "NOM_POKEMON_POK")
        )
        private List<Pokemons> pokemons;

        public List<Pokemons> getPokemons() {
                return pokemons;
        }

        public void setPokemons(List<Pokemons> pokemons) {
                this.pokemons = pokemons;
        }

        public Attaque() {

        }

        @Override
        public String toString() {
                return "Attaque{" +
                        "IdAt=" + IdAt +
                        ", nomAttaqueAt='" + nomAttaqueAt + '\'' +
                        ", puissanceAT=" + puissanceAT +
                        ", pokemons=" + pokemons.size() +
                        '}';
        }
}