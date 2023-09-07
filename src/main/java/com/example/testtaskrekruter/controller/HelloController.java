package com.example.testtaskrekruter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<String> getHelloMessage(@RequestParam String name, @RequestParam String message) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder
                .append("Hello ")
                .append(name)
                .append("!")
                .append(message)
                .append("!");

        return ResponseEntity
                .ok()
                .body(messageBuilder.toString());
    }
}
