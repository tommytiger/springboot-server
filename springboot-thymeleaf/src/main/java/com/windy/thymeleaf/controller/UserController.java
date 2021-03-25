package com.windy.thymeleaf.controller;

import com.windy.thymeleaf.entity.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RequestMapping("/user")
@RestController
public class UserController {

    private static List<User> userList = new ArrayList<>();
    static {
        User windy = new User("1", "windy", "root");
        User test = new User("2","张三","ewioosoi3223!fje0990");
        userList.add(windy);
        userList.add(test);

    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userList;
    }

    @PostMapping("/findbyId")
    public User getUserById(@RequestBody(required = true) String userId){
        Optional<User> option = userList.stream().filter(o -> o.getId().equals(userId)).findFirst();
        if (option.isPresent()) return option.get();
        return new User();
    }
}
