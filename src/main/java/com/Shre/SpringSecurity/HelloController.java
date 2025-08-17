package com.Shre.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String helloController(HttpServletRequest request) {
        return "Hello World"+ request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "Shreyash"+ request.getSession().getId();
    }
}
