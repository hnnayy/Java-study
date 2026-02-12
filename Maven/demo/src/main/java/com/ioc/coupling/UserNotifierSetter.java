package com.ioc.coupling;

public class UserNotifierSetter {
    private MessageService messageService;

    public UserNotifierSetter() { }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String user, String message) {
        if (messageService == null) {
            throw new IllegalStateException("MessageService not set");
        }
        messageService.sendMessage(user, message);
    }
}
