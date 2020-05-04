package com.safwan.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping
    public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {

        smsService.sendSms(smsRequest);

    }
}
