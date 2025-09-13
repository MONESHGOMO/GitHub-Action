package com.gomo.SpringBoot.with.GitHub.actions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/check")
    public String hello()
    {
        return "running";
    }
}
