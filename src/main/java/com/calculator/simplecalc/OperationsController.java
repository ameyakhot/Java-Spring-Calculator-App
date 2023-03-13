package com.calculator.simplecalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationsController {

    @GetMapping("/add/{num1}/{num2}")
    public Double add(@PathVariable Double num1, @PathVariable Double num2){
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public Double subtract(@PathVariable Double num1, @PathVariable Double num2){
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public Double multiply(@PathVariable Double num1, @PathVariable Double num2){
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public Double divide(@PathVariable Double num1, @PathVariable Double num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

}
