package com.safwan.twilio;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitializr {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializr.class);

    private TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioInitializr(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(twilioConfiguration.getAccountSid(), twilioConfiguration.getAuthToken());
        LOGGER.info("Twilio initialized...");
    }
}
