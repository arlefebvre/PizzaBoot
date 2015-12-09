package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.util.Random;

/**
 * Created by Arthur on 09/12/2015.
 */
@EnableGlobalMethodSecurity(securedEnabled = true)
@SpringBootApplication
public class HelloApplication {

    @Bean
    public HealthIndicator indicateurDeOuf(){
        return () -> {
            if(new Random().nextBoolean()){
                return Health.up().build();
            }
            else{
                return Health.down().withDetail("Etat de la pizza","Cramée").build();
            }
        };
    }

    @Configuration
    static class SecuriteDeOuf extends GlobalAuthenticationConfigurerAdapter{
        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("pepe").password("pepe").roles("CHEF", "USER")
                    .and()
                    .withUser("client").password("client").roles("USER");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run((HelloApplication.class));
    }}

