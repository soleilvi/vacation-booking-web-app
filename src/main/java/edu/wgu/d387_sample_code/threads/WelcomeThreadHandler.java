package edu.wgu.d387_sample_code.threads;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class WelcomeThreadInit implements Runnable{

    static ExecutorService messageExecutor=newFixedThreadPool(5);
    private final String propertyName;

    public WelcomeThreadInit(String propertyName) {
        this.propertyName = propertyName;
        System.out.println("Creating " + propertyName);
    }

    // @Override
    public String run() {
        System.out.println("Running " + propertyName);
        messageExecutor.execute(() -> {
            try {
                WelcomeMessage english = new WelcomeMessage(propertyName);
//                WelcomeController welcomeController = new WelcomeController(english.getWelcomeMessage());
                // System.out.println(english.getWelcomeMessage());
//                welcomeController.welcome();
            } catch (Exception e) {
                System.out.println("Thread " + propertyName + " failed.");
            }
            System.out.println("Thread exiting.");
            return "pee";
        });
    }

    public void pee() {
        System.out.println("Running in pee()");
    }
}
