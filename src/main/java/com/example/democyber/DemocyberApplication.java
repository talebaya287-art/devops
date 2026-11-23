package com.example.democyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoCyberApplication {

    private static final String GITHUB_TOKEN =
        "ghp_1234567890abcdef1234567890abcdef1234";

    public static void main(String[] args) {
        System.out.println("Application started");
    }
}