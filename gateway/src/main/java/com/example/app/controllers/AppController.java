package com.example.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AppController {


    @RequestMapping("/")
    public ResponseEntity<String> home() {
        return  ResponseEntity.ok("Home route is done, to do something here!");
    }

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("Fallback URL is returned, because the API gateway is timed out");
    }




}
