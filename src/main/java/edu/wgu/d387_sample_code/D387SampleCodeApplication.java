package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controller.WelcomeController;
import edu.wgu.d387_sample_code.threads.DisplayMessage;
import edu.wgu.d387_sample_code.threads.WelcomeThreadInit;
import edu.wgu.d387_sample_code.time.ConvertTimeZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

		DisplayMessage english = new DisplayMessage("languages_en_US.properties");
		english.getWelcomeMessage();

		ConvertTimeZone mountainTime = new ConvertTimeZone("MT");
		ConvertTimeZone universalTime = new ConvertTimeZone("UTC");
		ConvertTimeZone easternTime = new ConvertTimeZone("ET");

		System.out.println(mountainTime.getTimeAtTimeZone());
		System.out.println(easternTime.getTimeAtTimeZone());
		System.out.println(universalTime.getTimeAtTimeZone());

		WelcomeController welcomeController = new WelcomeController();
		welcomeController.welcome();
	}

}
