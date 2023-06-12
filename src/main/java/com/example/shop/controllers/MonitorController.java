package com.example.shop.controllers;

import com.example.shop.dao.entity.Monitor;
import com.example.shop.exceptions.monitorException.MonitorNotFoundException;
import com.example.shop.services.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monitor")
public class MonitorController {
    private final MonitorService service;

    @GetMapping("/")
    public List<Monitor> allMonitor(){
        return service.findAll();
    }

    @PostMapping("/create")
    public Monitor newLaptop(@RequestBody Monitor monitor){
        return service.save(monitor);
    }

    @GetMapping("/{id}")
    public Monitor oneMonitor(@PathVariable("id") Long id){
        return service.findById(id).orElseThrow(() -> new MonitorNotFoundException(id));
    }

    @PostMapping("/update/{id}")
    public Monitor updateMonitor(@PathVariable("id") Long id, @RequestBody Monitor monitor){
        return service.update(id, monitor);
    }
}
