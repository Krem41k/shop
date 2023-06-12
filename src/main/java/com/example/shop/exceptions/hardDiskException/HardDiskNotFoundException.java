package com.example.shop.exceptions.hardDiskException;

public class HardDiskNotFoundException extends RuntimeException{
    public HardDiskNotFoundException(Long id) {
        super("Could not find hard disk " + id);
    }
}
