package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

//    //Handles request at /hello
//    @GetMapping("hello") //will accept git requests
//    @ResponseBody //return plain text response, until we learn templates
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    //@ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //live /hello/hello
    //Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
   // @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
   // @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // lives at  /hello/form
    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type='text' name= 'name'>" +
                "<input type='submit' value='Greet me!'" +
                "<form>" +
                "<body>" +
                "<html>";
    }

}

