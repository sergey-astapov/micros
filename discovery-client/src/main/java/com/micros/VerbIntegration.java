package com.micros;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VerbIntegration {
    @Autowired
    VerbService verbService;

    @HystrixCommand(fallbackMethod = "defaultVerb")
    public String getVerb() {
        return verbService.getWord();
    }

    public String defaultVerb() {
        return "default";
    }
}
