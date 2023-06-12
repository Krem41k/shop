package com.example.shop.exceptions.monitorException;

public class MonitorNotFoundException extends RuntimeException{
    public MonitorNotFoundException(Long id) {
        super("Could not find monitor " + id);
    }
}
