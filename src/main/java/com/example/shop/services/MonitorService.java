package com.example.shop.services;

import com.example.shop.dao.entity.Monitor;
import com.example.shop.dao.repositories.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MonitorService {
    private final MonitorRepository repository;

    public Monitor save(Monitor monitor) {
        return repository.save(monitor);
    }

    public Monitor update(Monitor monitor) {
        return repository.save(monitor);
    }

    public List<Monitor> findAll() {
        return repository.findAll();
    }

    public Optional<Monitor> findById(Long id) {
        return repository.findById(id);
    }
}
