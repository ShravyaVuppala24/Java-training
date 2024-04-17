package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JuserController {
    @GetMapping("/jsonuser")
    public Userjson getUser() {
        Userjson userj = new Userjson("Shravya", 25);
        return userj;
}
}