package com.system.library.controller;

import com.system.library.entity.User;
import com.system.library.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author mawenjie
 * @Date 2019-07-22 17:55
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
