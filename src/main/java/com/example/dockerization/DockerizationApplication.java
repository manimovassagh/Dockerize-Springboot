package com.example.dockerization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DockerizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerizationApplication.class, args);
    }

@GetMapping("/")
    public String test() {
        return "Test is success";
    }
}
