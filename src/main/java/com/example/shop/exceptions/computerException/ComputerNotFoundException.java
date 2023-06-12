package com.example.shop.exceptions.computerException;

public class ComputerNotFoundException extends RuntimeException{
    public ComputerNotFoundException(Long id) {
        super("Could not find computer " + id);
    }
}
