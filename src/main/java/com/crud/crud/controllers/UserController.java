package com.crud.crud.controllers;

import com.crud.crud.dao.UserDao;
import com.crud.crud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "api/users/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id) {
        User user = new User(1, "christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }

    @RequestMapping(value = "api/users")
    public List<User> getListOfUsers() {
        return userDao.getUsers();
    }
    @RequestMapping(value = "api/users/{id}", method = RequestMethod.PUT)
    public User update() {
        User user = new User(1, "christian",
                "quijivix", "email@gmail.com",
                "12345678", "12345678");
        return user;
    }

    @RequestMapping(value = "api/users/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        userDao.delete(id);
    }
}
