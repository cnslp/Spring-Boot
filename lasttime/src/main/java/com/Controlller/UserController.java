package com.Controlller;

/**
 * Created by cnslp on 2017/4/21.
 */

import com.Service.UserService;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<User> list()
    {
        List<User> users = userService.findAll();
        System.out.println("list is");
        System.out.println(users);
        return users;
    }

}
