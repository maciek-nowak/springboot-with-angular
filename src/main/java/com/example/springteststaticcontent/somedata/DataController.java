package com.example.springteststaticcontent.somedata;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping
    public String getString() {
        return "koty";
    }
}
