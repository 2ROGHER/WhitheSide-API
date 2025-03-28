package com.example.products_ms.routers;

import com.example.products_ms.handlers.ProductsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 *
 */
@Configuration(proxyBeanMethods = false)
public class ProductsRouter {
   @Bean
    public RouterFunction<ServerResponse> router(ProductsHandler ph) {
       return RouterFunctions
               .route(GET("*/products").and(accept(MediaType.APPLICATION_JSON)), ProductsHandler::productHandler);
   }
}
