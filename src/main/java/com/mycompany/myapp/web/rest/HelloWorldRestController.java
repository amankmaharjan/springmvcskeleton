package com.mycompany.myapp.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aman on 5/9/17.
 */
@RestController
public class HelloWorldRestController {
    @RequestMapping("/api")
    public String welcome() {
        return "welcome to Rest Template Example";
    }
}
