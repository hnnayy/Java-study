package com.ioc.coupling;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("[Email] To: " + recipient + " | Message: " + message);
    }
}
