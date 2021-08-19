package com.gutmox.handlers;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.util.Optional;
import org.springframework.http.HttpStatus;

@Component
public class HelloHandler {

    public Mono<ServerResponse> execute(ServerRequest request) {
        return ServerResponse.ok().body(Mono.just("Hello, world"), String.class);
    }
}
