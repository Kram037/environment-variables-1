package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class MainController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getUser(){
        return environment.getProperty("myCustomProps.devName") + " " + environment.getProperty("myCustomProps.authCode");
    }
}