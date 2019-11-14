package com.edgetech.first.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome() {
        String name = "Eric";
        return "This is a string return from the server.  Hello " + name;
    }

}
