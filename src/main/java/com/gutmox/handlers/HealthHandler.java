package com.gutmox.handlers;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HealthHandler {

    public Mono<ServerResponse> execute(ServerRequest request) {
        return ServerResponse.ok().body(Mono.just("I'm healthy"), String.class);
    }
}
