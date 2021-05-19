package com.example.springreacttemplate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping(path = "/api/hello")
    public Map<String, String> hello() {
        Map<String, String> json = new HashMap<>();
        json.put("message", "Spring - React Project templates!! " + new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
        json.put("url", "https://github.com/TeamMarvelous/springboot-react-template");

        return json;
    }

    public String index() {
        return "index.html";
    }

}
