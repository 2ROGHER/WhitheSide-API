package com.example.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class UriConfiguration {
    private String httpbin = "http://httpbin.org:80";

    public String getHttpbin() {
        return this.httpbin;
    }

    public void setHttpbin(String httpbin) {
        this.httpbin = httpbin;
    }
}
