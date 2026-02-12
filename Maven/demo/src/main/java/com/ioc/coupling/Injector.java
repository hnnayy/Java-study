package com.ioc.coupling;

public final class Injector {
    private Injector() { }

    // simple factory style wiring
    public static UserNotifierConstructor createConstructorNotifier() {
        MessageService svc = new EmailService();
        return new UserNotifierConstructor(svc);
    }

    public static UserNotifierSetter createSetterNotifier() {
        UserNotifierSetter setter = new UserNotifierSetter();
        setter.setMessageService(new SMSService());
        return setter;
    }
}
