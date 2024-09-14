package com.server.pard.week3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellocController {
    @RequestMapping("/hello")
    public String bye(){
        return "hello.html";
    }
}
