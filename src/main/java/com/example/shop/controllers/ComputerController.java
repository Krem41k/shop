package com.example.shop.controllers;

import com.example.shop.dao.entity.Computer;
import com.example.shop.exceptions.computerException.ComputerNotFoundException;
import com.example.shop.services.ComputerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/computer")
public class ComputerController {
    private final ComputerService service;

    @GetMapping("/")
    public List<Computer> allComputer(){
        return service.findAll();
    }

    @PostMapping("/create")
    public Computer newComputer(@RequestBody Computer computer){
        return service.save(computer);
    }

    @GetMapping("/{id}")
    public Computer oneComputer(@PathVariable("id") Long id){
        return service.findById(id).orElseThrow(() -> new ComputerNotFoundException(id));
    }

    @PostMapping("/update/{id}")
    public Computer updateComputer(@PathVariable("id") Long id, @RequestBody Computer computer){
        return service.update(id, computer);
    }
}
