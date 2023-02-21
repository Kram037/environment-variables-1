package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class MainController {

    @Value("${myCustomProps.devName}")
    private String myCustomEnv;

    @Value("${myCustomProps.authCode}")
    private String authCode;

    @GetMapping("")
    public String getProperty(){
        return myCustomEnv + " " + authCode;
    }
}