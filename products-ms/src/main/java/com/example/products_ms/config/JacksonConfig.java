package com.example.products_ms.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * This configuration class is used to control the (JSON) parser with Jackson
 * It uses the Jackson library to parse responses from API Gateway
 * [@Configuration] indicates that this class is used to create [beans] and this will be managed by the Spring Context.
 */
@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper().registerModule(new JavaTimeModule());
    }
}
