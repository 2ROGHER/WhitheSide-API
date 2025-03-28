package com.example.products_ms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

/**
 * This allows us to configure the [auditing] each entity.
 * This class manages [Beans]. So, the Spring Context knows how to manage an inject this configuration in clases with
 * [@Autowired] annotation.
 */
@Configuration
@EnableMongoAuditing // This allows to track and audit collections at db
public class MongoConfig {
    //TODO("implement all configuration related with MongoDB");
}
