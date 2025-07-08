package com.cbcf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cbcf.model.*;

@RestController
//Namf_Communication service
@RequestMapping("/namf-communication")
public class NamfCommunicationController {

	//NonUeMessageTransfer
    @PostMapping("/non-ue-message-transfer")
    public ResponseEntity<String> nonUeMessageTransfer(@RequestBody NonUeMessageTransferRequest request) {
        return ResponseEntity.ok("Non-UE Message Transfer success for: " + request.getMessageId());
    }
    
    //NonUeN2InfoSubscribe
    @PostMapping("/non-ue-n2-info-subscribe")
    public ResponseEntity<String> nonUeN2InfoSubscribe(@RequestBody NonUeN2InfoSubscribeRequest request) {
        return ResponseEntity.ok("Non-UE N2 Info Subscribed: " + request.getSubscriptionId());
    }

    //NonUeN2InfoUnsubsribe
    @PostMapping("/non-ue-n2-info-unsubscribe")
    public ResponseEntity<String> nonUeN2InfoUnsubscribe(@RequestBody NonUeN2InfoUnsubscribeRequest request) {
        return ResponseEntity.ok("Non-UE N2 Info Unsubscribed: " + request.getSubscriptionId());
    }
}
