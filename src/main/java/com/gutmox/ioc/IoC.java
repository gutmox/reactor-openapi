package com.gutmox.ioc;

import com.gutmox.handlers.HealthHandler;
import com.gutmox.handlers.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IoC {
    @Autowired
    private HelloHandler helloHandler;
    @Autowired
    private HealthHandler healthHandler;

    public HelloHandler getHelloHandler() {
        return helloHandler;
    }

    public HealthHandler getHealthHandler() {
        return healthHandler;
    }
}
