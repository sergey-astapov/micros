package com.micros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @Autowired
    LoadBalancerClient client;

    @Autowired
    VerbIntegration verbIntegration;

    @RequestMapping("/sentence")
    public @ResponseBody String getSentence() {
        return getWord("discoverable-service-subject") + "." +
                getWord("discoverable-service-noun") + "." +
                getWord("discoverable-service-verb") + ".";
    }

    @RequestMapping("/sentence/feign")
    public @ResponseBody String getSentenceFeign() {
        return getWord("discoverable-service-subject") + "." +
                getWord("discoverable-service-noun") + "." +
                verbIntegration.getVerb() + ".";
    }

    public String getWord(String service) {
        ServiceInstance i = client.choose(service);
        return i != null ? (new RestTemplate()).getForObject(i.getUri(), String.class) : null;
    }
}
