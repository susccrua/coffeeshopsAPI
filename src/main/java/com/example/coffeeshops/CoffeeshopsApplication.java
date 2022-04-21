package com.example.coffeeshops;

import com.example.coffeeshops.coffeeshop.Coffeeshop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class CoffeeshopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeshopsApplication.class, args);
	}

}
