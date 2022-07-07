package com.crud.crud.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "proof")
    public String proof() {
        return "proof";
    }
}
