package com.micros;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("DISCOVERABLE-SERVICE-VERB")
public interface VerbService {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getWord();
}
