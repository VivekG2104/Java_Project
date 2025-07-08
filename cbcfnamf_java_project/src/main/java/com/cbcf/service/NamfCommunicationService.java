package com.cbcf.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cbcf.model.NonUeN2InfoSubscribeRequest;

@RestController
@Service
@RequestMapping("/namf-communication")
public class NamfCommunicationService {

	//GetMapping
    @GetMapping("/namf-communication/{subscriptionId}")
    public ResponseEntity<NonUeN2InfoSubscribeRequest> getSubscriptionId(
            @PathVariable("subscriptionId") String subscriptionId) {

        NonUeN2InfoSubscribeRequest response = fetchRequestBySubscriptionId(subscriptionId);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }

    private NonUeN2InfoSubscribeRequest fetchRequestBySubscriptionId(String subscriptionId) {
        
        return new NonUeN2InfoSubscribeRequest();
    }
}