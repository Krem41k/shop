package com.example.shop.services;

import com.example.shop.dao.entity.Computer;
import com.example.shop.dao.repositories.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository repository;

    public Computer save(Computer computer){
        return repository.save(computer);
    }

    public Computer update(Long id, Computer computer){
        Optional<Computer> oldComputer = repository.findById(id);
        if (oldComputer.isPresent()){
            Computer _computer = oldComputer.get();
            _computer.setFormFactor(computer.getFormFactor());
            _computer.setManufacturer(computer.getManufacturer());
            _computer.setPrice(computer.getPrice());
            _computer.setQuantity(computer.getQuantity());
            _computer.setSeriesNnumber(computer.getSeriesNnumber());
            return repository.save(_computer);
        }
        return repository.save(computer);
    }

    public List<Computer> findAll(){
        return repository.findAll();
    }

    public Optional<Computer> findById(Long id){
        return repository.findById(id);
    }
}
