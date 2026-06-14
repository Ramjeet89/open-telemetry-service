package dev.learn.java.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class.getName());

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        log.info("Received request to greet {}", name);
        simulateWork();
        return "Hello, " + name + "!";
    }

    @GetMapping("/slow")
    public String slow() throws InterruptedException {
        log.info("Starting slow operation");
        Thread.sleep(500);
        log.info("Slow Operation Completed");
        return "Done!";
    }

    private void simulateWork() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
