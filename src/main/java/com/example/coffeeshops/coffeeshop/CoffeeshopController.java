package com.example.coffeeshops.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/coffeeshop")
public class CoffeeshopController {

    private final CoffeeshopService coffeeshopService;

    @Autowired
    public CoffeeshopController(CoffeeshopService coffeeshopService) {
        this.coffeeshopService = coffeeshopService;
    }

    @GetMapping
    public List<Coffeeshop> hello(){
        return coffeeshopService.getCoffeeshops();
    }

    @PostMapping
    public void addCoffeeshop(@RequestBody Coffeeshop coffeeshop){
        coffeeshopService.addNewCoffeeshop(coffeeshop);
    }

    @DeleteMapping(path="{id}")
    public void deleteCoffeeshop(@PathVariable("id")Long id){
        coffeeshopService.deleteCoffeeshop(id);
    }
}
