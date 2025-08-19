//csrf- cross site request forgery

package com.Shre.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String helloController(HttpServletRequest request) {
        return "Hello World ";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Shreyash "+ request.getSession().getId();
    }
}
