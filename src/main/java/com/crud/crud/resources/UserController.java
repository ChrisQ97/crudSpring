package com.crud.crud.resources;

import com.crud.crud.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "user")
    public User getUser() {
        User user = new User("christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }
}
