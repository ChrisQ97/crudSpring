package com.crud.crud.resources;

import com.crud.crud.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User(1, "christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }

    @RequestMapping(value = "users")
    public List<User> getListOfUsers() {
        List<User> users = new ArrayList<>();
        for (Integer i = 1; i <= 20; i++) {
            User user = new User(i, "name " + i.toString() ,
                    "last name " + i.toString(), "email" + i.toString(),
                    "12345678", "12345678");
            users.add(user);
        }
        return users;
    }
    @RequestMapping(value = "user1")
    public User update() {
        User user = new User(1, "christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }

    @RequestMapping(value = "user2")
    public User delete() {
        User user = new User(1, "christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }
}
