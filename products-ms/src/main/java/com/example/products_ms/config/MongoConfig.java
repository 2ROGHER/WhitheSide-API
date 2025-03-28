package com.example.products_ms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * This allows us to configure the [auditing] each entity.
 */
@Configuration
@EnableMongoAuditing
public class MongoConfig {
}
