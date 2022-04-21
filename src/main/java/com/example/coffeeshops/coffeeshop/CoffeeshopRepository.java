package com.example.coffeeshops.coffeeshop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface CoffeeshopRepository extends JpaRepository<Coffeeshop, Long> {
    Optional<Coffeeshop> findCoffeeshopByName(String name);
}
