package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
	return "OK";
    }

    @RequestMapping("/q1")
    public String q1(Model model) {
	return "q1";
    }
}
