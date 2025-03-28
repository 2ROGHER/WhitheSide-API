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
 * This class is used to manage and handle the [handler] defined at [handlers]
 * This class exposes an only single route '/products' when receiving the request from the client.
 * This class matches the route '/products' and crate a response with the [value] or values provided by the [handler]
 */
@Configuration(proxyBeanMethods = false)
public class ProductsRouter {

   @Bean
    public RouterFunction<ServerResponse> router(ProductsHandler ph) {
       return (RouterFunction<ServerResponse>) RouterFunctions
               .route(GET("/products")
                       .and(accept(MediaType.APPLICATION_JSON)), ph::productsHandler);
   }
}
