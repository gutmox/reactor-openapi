package com.gutmox.router;

import com.gutmox.handlers.HealthHandler;
import com.gutmox.handlers.HelloHandler;
import com.gutmox.ioc.IoC;
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
    public RouterFunction<ServerResponse> route(IoC ioC) {
        return RouterFunctions.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), ioC.getHelloHandler()::execute)
                .andRoute(RequestPredicates.GET("/health").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), ioC.getHealthHandler()::execute);
    }
}
