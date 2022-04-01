package com.github.sonar.example.sonarexamplegithub;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SonarExampleGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SonarExampleGithubApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.get("55");

        String ab = "a" + "b";
        return "hello github";
    }

}
