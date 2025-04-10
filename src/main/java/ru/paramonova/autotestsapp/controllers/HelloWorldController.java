package ru.paramonova.autotestsapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("api//hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, kitties!");
    }
}