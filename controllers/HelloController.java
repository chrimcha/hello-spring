package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //handle request at path http://localhost:8080/hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //handle request at path //http://localhost:8080/hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }

    //handle requests of the form http://localhost:8080/hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }

    //handle requests of the form http://localhost:8080/hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }

    //handles requests for http://localhost:8080/hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/hello' method = 'post'>" + // submit a request to /hello
                "<input type = 'text' name = 'name' >" +
                "<select name='languages' id='language-select'>" +
                "<option value='default'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='polish'>Polish</option>" +
                "<option value='thai'>Thai</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // Include a new public static method, createMessage, in the HelloController that takes a name as well as a language string. Based on the language string, you’ll display the proper greeting.
    @GetMapping("")
    public static String createMessage(@RequestParam String name, @RequestParam String languages) {
        switch (languages) {
            case "thai" -> {
                return "S̄wạs̄dī," + name + "!";
            }
            case "polish" -> {
                return  "Witam," + name + "!";
            }
            case "spanish" -> {
                return "Hola," + name + "!";
            }
            case "french" -> {
                return "Bonjour," + name + "!";
            }
            default -> {
                return "Hel6lo," + name + "!";
                }
        }
    }
}