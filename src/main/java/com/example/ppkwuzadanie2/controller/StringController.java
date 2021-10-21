package com.example.ppkwuzadanie2.controller;

import com.example.ppkwuzadanie2.StringData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {

    @GetMapping("/{text}")
    StringData getStringData(@PathVariable String text) {
        return new StringData(text);
    }
}
