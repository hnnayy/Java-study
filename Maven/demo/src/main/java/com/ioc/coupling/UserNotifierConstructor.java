package com.ioc.coupling;

public class UserNotifierConstructor {
    private final MessageService messageService;

    public UserNotifierConstructor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String user, String message) {
        messageService.sendMessage(user, message);
    }
}
