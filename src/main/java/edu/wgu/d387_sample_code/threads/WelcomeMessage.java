package edu.wgu.d387_sample_code.threads;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Properties;

public class DisplayMessage {

    private final String propertyName;

    public DisplayMessage(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getWelcomeMessage() {

        Properties properties = new Properties();

        try {
            InputStream inputStream = new ClassPathResource(propertyName).getInputStream();

            properties.load(inputStream);
//            WelcomeThreadInit enInit = new WelcomeThreadInit("English", properties.getProperty("welcome"));
//            WelcomeThreadInit frInit = new WelcomeThreadInit("French", properties.getProperty("welcome"));

//            Thread enThread = new Thread(enInit);
//            Thread frThread = new Thread(frInit);
//
//            enThread.start();
//            frThread.start();

            return properties.getProperty("welcome");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
