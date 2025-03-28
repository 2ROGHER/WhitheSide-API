package com.example.app.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * This class is used to configurate the routes to crate and filter and redirect requests to enter this Gateway.
 *
 * @author <a heref="mailto:rogers.mestanza@gmail.com">Roger Mestanza</a>
 */
@EnableConfigurationProperties(UriConfiguration.class)
@Configuration
public class RouterConfig {

    public String something() {
        return "some method";
    }

    /**
     * This method is takes in a [RouterLocatorBuilder] that allows to create routes configuration.
     * Also, [RouterLocatorBuilder] allows to add [predicates and filters] to routes to manage the routes under certain conditions.
     *
     * @param builder [RouterLocatorBuilder]
     * @return RouterLocatorBuilder
     */

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfiguration uri) {
        return builder.routes()
                // First route configuration
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World")) // Here we add the filter with the [Hello] request header before that it is routed.
                        .uri(uri.getHttpbin())

                )
                // Second route configuration
                // Adding [circuit breaker] to router builder.
                .route(p -> p
                        .host("**.circuitbreaker.com")
                        .filters(f -> f
                                .addRequestHeader("Host", "www.circuitbreaker.com") // Enforce the [header] if by any problem the command [curl] no send well the request.
                                .circuitBreaker(config -> config
                                        .setName("mycmd")
                                        .setFallbackUri("forward:/fallback")))// Whether the [api timesout] we need to send a [fallback] to clients. In this case is a [uri]

                        .uri("http://httpbin.org:80")
                )
                .build(); // This used a [builder] pattern.
    }
}
