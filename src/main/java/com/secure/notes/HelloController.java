package com.secure.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Secure Notes!";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact us now!";
    }
}
