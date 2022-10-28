package com.example.Backendv1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class login {
    @GetMapping("/login")
    public static String login(@RequestParam("user") String user, @RequestParam("pass") String pass){
        if(user=="a"&&pass=="a")
            return "successful";
        return "Fail Try Again";
    }
}
