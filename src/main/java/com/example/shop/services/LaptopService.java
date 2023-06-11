package com.example.shop.services;

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

    public Laptop update(Laptop laptop) {
        return repository.save(laptop);
    }

    public List<Laptop> findAll() {
        return repository.findAll();
    }

    public Optional<Laptop> findById(Long id) {
        return repository.findById(id);
    }
}
