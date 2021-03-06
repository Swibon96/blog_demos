package com.bolingcavalry.parameterized.service.impl;

import com.bolingcavalry.parameterized.service.HelloService;
import org.springframework.stereotype.Service;

@Service()
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public int increase(int value) {
        return value + 1;
    }

    @Override
    public boolean remoteRequest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

        return true;
    }
}
