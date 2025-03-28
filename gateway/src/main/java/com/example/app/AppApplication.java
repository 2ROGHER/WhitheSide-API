package com.example.app;

import com.example.app.config.RouterConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication {
    // This is the first way to add loggers to the application
    private static final Logger logger = LoggerFactory.getLogger(AppApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
        logger.info("Hello world!");
        logger.info("This is my application with MSA pattern");
    }
}
