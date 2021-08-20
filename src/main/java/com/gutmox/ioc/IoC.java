package com.gutmox.ioc;

import com.gutmox.handlers.HealthHandler;
import com.gutmox.handlers.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IoC {
    @Autowired
    public HelloHandler helloHandler;
    @Autowired
    public HealthHandler healthHandler;
}
