package hello;

import hello.domain.Pizza;
import hello.domain.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Arthur on 09/12/2015.
 */
@Component
public class PepePizza implements CommandLineRunner {

    @Autowired
    PizzaRepository pizzaRepository;

    @Override
    public void run(String... strings) throws Exception {
        pizzaRepository.save(new Pizza("Royale","Une pizza classique",12));
        pizzaRepository.save(new Pizza("Tartiflette","Une pizza grasse",15));
        pizzaRepository.save(new Pizza("Light","Une pizza avec juste de la pate",5));
    }
}
