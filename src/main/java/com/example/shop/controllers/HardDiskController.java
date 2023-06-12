package com.example.shop.controllers;

import com.example.shop.dao.entity.HardDisk;
import com.example.shop.exceptions.hardDiskException.HardDiskNotFoundException;
import com.example.shop.services.HardDiskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hard_disk")
public class HardDiskController {
    private final HardDiskService service;

    @GetMapping("/")
    public List<HardDisk> allHardDisk(){
        return service.findAll();
    }

    @PostMapping("/create")
    public HardDisk newHardDisk(@RequestBody HardDisk hardDisk){
        return service.save(hardDisk);
    }

    @GetMapping("/{id}")
    public HardDisk oneHardDisk(@PathVariable("id") Long id){
        return service.findById(id).orElseThrow(() -> new HardDiskNotFoundException(id));
    }

    @PostMapping("/update/{id}")
    public HardDisk updateHardDisk(@PathVariable("id") Long id, @RequestBody HardDisk hardDisk){
        return service.update(id, hardDisk);
    }
}
