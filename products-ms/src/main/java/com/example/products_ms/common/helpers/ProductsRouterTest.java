package com.example.products_ms.common.helpers;

import com.example.products_ms.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ProductsRouterTest {

    private final WebClient client;

    // Spring Boot auto-configures a `WebClient.Builder` instance with nice defaults and customizations.
    // We can use it to create a dedicated `WebClient` for our component.
    public ProductsRouterTest(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    /**
     * Method to test the routes that returns Product type object.
     * @return
     */
//    public Mono<String> getMessage() {
//        return this.client.get().uri("/products").accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .bodyToMono(Product.class)
//                .map(Product::getName);
//    }

    public Mono<String> getMessage() {
        return this.client.get().uri("/products").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }



}