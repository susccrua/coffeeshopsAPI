package com.example.coffeeshops.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeshopService {

    private final CoffeeshopRepository coffeeshopRepository;

    @Autowired
    public CoffeeshopService(CoffeeshopRepository coffeeshopRepository){
        this.coffeeshopRepository= coffeeshopRepository;
    }
    public List<Coffeeshop> getCoffeeshops(){
        return coffeeshopRepository.findAll();
    }

    public void addNewCoffeeshop(Coffeeshop coffeeshop){
       Optional<Coffeeshop> coffeeshopOptional = coffeeshopRepository.findCoffeeshopByName(coffeeshop.getName());
       if(coffeeshopOptional.isPresent()){
           throw new IllegalStateException("Name taken!");
       }
       coffeeshopRepository.save(coffeeshop);
        System.out.println(coffeeshop);
    }

    public void deleteCoffeeshop(Long id) {
        boolean exists = coffeeshopRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Does not exist!");
        }
        coffeeshopRepository.deleteById(id);
    }

}
