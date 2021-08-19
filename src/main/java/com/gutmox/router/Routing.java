package com.gutmox.router;

import com.gutmox.handlers.HealthHandler;
import com.gutmox.handlers.HelloHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routing {

    @Bean
    public RouterFunction<ServerResponse> route(HelloHandler helloHandler, HealthHandler healthHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloHandler::execute)
                .andRoute(RequestPredicates.GET("/health").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), healthHandler::execute);
    }
}
