package com.example.shop.controllers;

import com.example.shop.dao.entity.Laptop;
import com.example.shop.exceptions.laptopException.LaptopNotFoundException;
import com.example.shop.services.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/laptop")
public class LaptopController {
    private final LaptopService service;

    @GetMapping("/")
    public List<Laptop> allLaptop(){
        return service.findAll();
    }

    @PostMapping("/create")
    public Laptop newLaptop(@RequestBody Laptop laptop){
        return service.save(laptop);
    }

    @GetMapping("/{id}")
    public Laptop oneLaptop(@PathVariable("id") Long id){
        return service.findById(id).orElseThrow(() -> new LaptopNotFoundException(id));
    }

    @PostMapping("/update/{id}")
    public Laptop updateLaptop(@PathVariable("id") Long id, @RequestBody Laptop laptop){
        return service.update(id, laptop);
    }
}
