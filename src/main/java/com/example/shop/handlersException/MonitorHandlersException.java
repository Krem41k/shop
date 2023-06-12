package com.example.shop.handlersException;

import com.example.shop.exceptions.laptopException.LaptopNotFoundException;
import com.example.shop.exceptions.monitorException.MonitorNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MonitorHandlersException {
    @ExceptionHandler(MonitorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String monitorNotFoundHandler(MonitorNotFoundException ex) {
        return ex.getMessage();
    }
}
