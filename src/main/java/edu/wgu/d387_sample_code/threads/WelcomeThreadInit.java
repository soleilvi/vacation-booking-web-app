package edu.wgu.d387_sample_code.threads;

public class WelcomeThreadInit implements Runnable{
    private Thread t;
    private String language;
    private String welcome;

    public WelcomeThreadInit(String language, String welcome) {
        this.language = language;
        this.welcome = welcome;
        System.out.println("Creating " + language);
    }

    @Override
    public void run() {
        System.out.println("Running " + language);
        try {
            System.out.println(welcome);
        } catch (Exception e) {
            System.out.println("Thread " + language + " failed.");
        }
        System.out.println("Thread " + language + " exiting.");
    }
}
