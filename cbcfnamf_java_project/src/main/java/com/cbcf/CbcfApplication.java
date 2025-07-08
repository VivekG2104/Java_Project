package com.cbcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CbcfApplication {
    public static void main(String[] args) {
        SpringApplication.run(CbcfApplication.class, args);
        System.out.println("Cell Broadcast Center Function Application started");
    }
}
