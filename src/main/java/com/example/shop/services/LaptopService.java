package com.example.shop.services;

import com.example.shop.dao.entity.HardDisk;
import com.example.shop.dao.entity.Laptop;
import com.example.shop.dao.repositories.LaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final LaptopRepository repository;

    public Laptop save(Laptop laptop) {
        return repository.save(laptop);
    }

    public Laptop update(Long id, Laptop laptop) {
        Optional<Laptop> oldLaptop = repository.findById(id);
        if (oldLaptop.isPresent()){
            Laptop _laptop = oldLaptop.get();
            _laptop.setSize(laptop.getSize());
            _laptop.setManufacturer(laptop.getManufacturer());
            _laptop.setPrice(laptop.getPrice());
            _laptop.setQuantity(laptop.getQuantity());
            _laptop.setSeriesNnumber(laptop.getSeriesNnumber());
            return repository.save(_laptop);
        }
        return repository.save(laptop);
    }

    public List<Laptop> findAll() {
        return repository.findAll();
    }

    public Optional<Laptop> findById(Long id) {
        return repository.findById(id);
    }
}
