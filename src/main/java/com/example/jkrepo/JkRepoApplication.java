package com.example.jkrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JkRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkRepoApplication.class, args);
        Logger LOGGER = Logger.getLogger(JkRepoApplication.class.getName());
        LOGGER.info("Application running fine");
    }

}
