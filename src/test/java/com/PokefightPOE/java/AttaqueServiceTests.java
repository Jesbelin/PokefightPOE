package com.PokefightPOE.java;

import com.PokefightPOE.java.Model.Attaque;
import com.PokefightPOE.java.Service.AttaqueService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttaqueServiceTests {
    @Autowired
    private AttaqueService attaqueService;

    @Test
    public void attaqueExist() throws Exception {

        //given
        String nomAttaque = "Seisme";

        //when
        Attaque a = attaqueService.findByNomAttaqueAt(nomAttaque);


        //then
        Assert.assertTrue(a != null);
        System.out.println(a);
    }

}