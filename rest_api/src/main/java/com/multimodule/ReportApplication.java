package com.multimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.multimodule")
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.multimodule.ReportApplication.class, args);
    }
}
