package com.example.coffeeshops.coffeeshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CoffeeshopConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            CoffeeshopRepository repo
    ) {
        return args -> {
            Coffeeshop summerMoon = new Coffeeshop(
                    1L,
                    "Summer Moon",
                    923.00,
                    1213.00,
                    9
            );
            Coffeeshop lemma = new Coffeeshop(
                    "Lemma",
                    -1344.00,
                    234.00,
                    10
            );

            repo.saveAll(
                List.of(summerMoon, lemma)
                    );
        };
        //Hibernate will run SQL based on this
    }
}
