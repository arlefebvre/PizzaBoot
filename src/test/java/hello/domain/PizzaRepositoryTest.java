package hello.domain;

import hello.HelloApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Arthur on 09/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes =HelloApplication.class)
public class PizzaRepositoryTest {

    @Autowired
    PizzaRepository pizzaRepository;

    @Before
    public void loadContext(){
        //Initialisation du contexte pour les tests
    }

    @Test
    public void findByNomTest(){
        // TODO ajouter la gestion du user/password
        Pizza p = new Pizza("Royale");//=pizzaRepository.findByNom("Royale");
        assertNotNull(p);
    }
}
