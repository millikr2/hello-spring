package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Chris Bay
 */
@Controller
public class HelloController {

    // response to GET requests to the root path: /
    @GetMapping("")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    // response to requests at /bonjour
    @GetMapping("bonjour")
    @ResponseBody
    public String bounjour() {
        return "Bonjour, Spring!";
    }

    // responds to GET requests like /hello/hello?name=Chris
    @GetMapping("hello")
    @ResponseBody
    public String helloQuery(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // responds to GET requests like /hello/hi/Chris
    @GetMapping("hi/{name}")
    @ResponseBody
    public String hiQuery(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // /hello/hello-forms
    @GetMapping("hello-forms")
    @ResponseBody
    public String helloForms() {
        return "<form method='POST'><input name='name' type='text'><button type='submit'>Greet Me!</button></form>";
    }

    @PostMapping("hello-forms")
    @ResponseBody
    public String helloForms(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

}
