package com.micros;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${property.1}")
    String property1;

    @RequestMapping("/property1")
    public String property1() {
        return "The property1 is: " + property1;
    }
}
