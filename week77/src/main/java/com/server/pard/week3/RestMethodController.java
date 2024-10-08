package com.server.pard.week3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RestMethodController {
    @GetMapping("")
    public String getUsers(){
        return " GEt Method controller";
    }

    @PostMapping("")
    public String postUsers(){
        return "Add Users to DB";
    }

    @GetMapping("/{userId}")
    public String getUsersById(@PathVariable Long userId){
        return "userId : " + userId;
    }

    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable Long userId){
        return userId + "번 유저의 정보를 수정";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Long userId){
        return userId + " 번 유저 정보 삭제";
    }
}
