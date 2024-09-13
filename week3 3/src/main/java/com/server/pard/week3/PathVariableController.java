package com.server.pard.week3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
    @RequestMapping("/path/{name}")
    public String pathV1(@PathVariable("name") String userName){
        System.out.println("1번 path 이름 " + userName);
        return "1번 path 이름 " + userName;
    }

    @RequestMapping("/pathV2/{name}")
    public String pathV2(@PathVariable String name){
        return "2번 path 이름 " + name;
    }

    @RequestMapping("/pathV3/{name}/{age}")
    public String pathV3(@PathVariable String name, @PathVariable long age){
        return "3번 path 이름 " + name + " 나이 : " + age;
    }
}
