package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // Handles request at /hello
    // @ResponseBody returns plain text response, will use templates instead later on
    // @GetMapping specifies that this method handles GET requests
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }

}
