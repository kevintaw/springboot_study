package com.kevin.springboot_study.controller;

import com.kevin.springboot_study.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kevin on 16-6-30.
 */
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping
    public String getAuthorInfo() {
        return "author name is " + authorSettings.getName() + " and author age is" + authorSettings.getAge();
    }
}
