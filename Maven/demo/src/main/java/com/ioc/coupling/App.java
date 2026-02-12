package com.ioc.coupling;

public class App {
    public static void main(String[] args) {
        System.out.println("== IoC example: Constructor Injection ==");
        UserNotifierConstructor constructorNotifier = Injector.createConstructorNotifier();
        constructorNotifier.notifyUser("alice@example.com", "Welcome, Alice!");

        System.out.println("\n== IoC example: Setter Injection ==");
        UserNotifierSetter setterNotifier = Injector.createSetterNotifier();
        setterNotifier.notifyUser("+628123456789", "Halo dari SMS!");

        System.out.println("\n== Manual swap at runtime ==");
        // demonstrate loose coupling: swap implementation at runtime
        UserNotifierSetter runtime = new UserNotifierSetter();
        runtime.setMessageService(new EmailService());
        runtime.notifyUser("bob@example.com", "This was swapped to Email at runtime");
    }
}
