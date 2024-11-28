package edu.wgu.d387_sample_code.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
// @RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {

        String welcomeMessage = "{\"welcomeMessage\": \"Hello World!\"}";

        JSONObject jsonObject = new JSONObject(welcomeMessage);
        System.out.println(jsonObject);

        return jsonObject.toString();
    }
}
