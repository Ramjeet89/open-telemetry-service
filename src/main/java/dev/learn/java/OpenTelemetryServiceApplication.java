package dev.learn.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenTelemetryServiceApplication {

    static void main(String[] args) {
        SpringApplication.run(OpenTelemetryServiceApplication.class, args);
    }
}
