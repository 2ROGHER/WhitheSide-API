package com.example.products_ms.handlers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * This [handler class] is used to control and manage the [requests] and then it create the
 * responses.
 * This uses the [Reactive approachability]
 * Uses the [@Component] decorator to create a [Bean]
 * The method [ProductHandler.productHandler] receive the [request] by the client and create the [response]
 */
@Component
public class ProductsHandler {
    // Uses the Mono Spring Reactive
    public static Mono<ServerResponse> productHandler(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("Hello World!")); // TODO("replace the string by anything")
    }
}
