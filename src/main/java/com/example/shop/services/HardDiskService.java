package com.example.shop.services;

import com.example.shop.dao.entity.HardDisk;
import com.example.shop.dao.repositories.HardDiskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HardDiskService {
    private final HardDiskRepository repository;

    public HardDisk save(HardDisk hardDisk) {
        return repository.save(hardDisk);
    }

    public HardDisk update(HardDisk hardDisk) {
        return repository.save(hardDisk);
    }

    public List<HardDisk> findAll() {
        return repository.findAll();
    }

    public Optional<HardDisk> findById(Long id) {
        return repository.findById(id);
    }
}
