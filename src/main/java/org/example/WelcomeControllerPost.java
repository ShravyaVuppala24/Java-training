package org.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControllerPost {
    @PostMapping ("/Hellopost")
    public String welcomep(@RequestBody String name1) {
        return WelcomeName.printWelcomeName(name1);
    }
}
