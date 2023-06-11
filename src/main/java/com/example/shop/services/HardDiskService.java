package com.example.shop.services;

import com.example.shop.dao.entity.Computer;
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

    public HardDisk update(Long id, HardDisk hardDisk) {
        Optional<HardDisk> oldHardDisk = repository.findById(id);
        if (oldHardDisk.isPresent()){
            HardDisk _hardDisk = oldHardDisk.get();
            _hardDisk.setVolume(hardDisk.getVolume());
            _hardDisk.setManufacturer(hardDisk.getManufacturer());
            _hardDisk.setPrice(hardDisk.getPrice());
            _hardDisk.setQuantity(hardDisk.getQuantity());
            _hardDisk.setSeriesNnumber(hardDisk.getSeriesNnumber());
            return repository.save(_hardDisk);
        }
        return repository.save(hardDisk);
    }

    public List<HardDisk> findAll() {
        return repository.findAll();
    }

    public Optional<HardDisk> findById(Long id) {
        return repository.findById(id);
    }
}
