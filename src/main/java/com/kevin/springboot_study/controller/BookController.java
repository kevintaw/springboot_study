package com.kevin.springboot_study.controller;

import com.kevin.springboot_study.config.BookSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by kevin on 16-6-30.
 */

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookSettings bookSettings;

    @RequestMapping
    public String getBookInfo() {
        return "book name is:" + bookSettings.getName() + " and book author is:" + bookSettings.getAuthor();
    }
}
