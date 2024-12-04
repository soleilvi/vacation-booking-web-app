package edu.wgu.d387_sample_code.controller;

import edu.wgu.d387_sample_code.threads.WelcomeThreadHandler;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@CrossOrigin("http://localhost:4200")
@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    // @ResponseBody  // Already implicit
    // @GetMapping("/welcome")
    public String getWelcomeMessages() {
        String enWelcome;
        String frWelcome;

        ExecutorService messageExecutor = Executors.newFixedThreadPool(2);
        Future<String> english = messageExecutor.submit(new WelcomeThreadHandler("languages_en_US.properties"));
        Future<String> french = messageExecutor.submit(new WelcomeThreadHandler("languages_fr_CA.properties"));

        try {
            enWelcome = english.get();
            frWelcome = french.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        return "{\"welcomeMessage\": \"" + enWelcome + "\"}";
    }
}
