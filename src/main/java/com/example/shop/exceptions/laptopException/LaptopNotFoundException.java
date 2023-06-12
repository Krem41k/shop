package com.example.shop.exceptions.laptopException;

public class LaptopNotFoundException extends RuntimeException{
    public LaptopNotFoundException(Long id) {
        super("Could not find laptop " + id);
    }
}
