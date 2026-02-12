package com.ioc.coupling;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("[SMS] To: " + recipient + " | Message: " + message);
    }
}
