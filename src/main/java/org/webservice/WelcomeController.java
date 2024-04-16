package org.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping({"/Hellonameage"})
    public String welcome(@RequestParam String name, @RequestParam Integer age) {
        return WelcomeName.printWelcomeName(name, age);
    }

    @GetMapping("/Hello")
    public String welcomebasic(@RequestParam String name) {
        return WelcomeName.printWelcomeName(name);
    }
}
