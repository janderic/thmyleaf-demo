package com.gmail.janderic.kuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/login")
    public String root(Model model) {
        model.addAttribute("msg", "请求的login");
        return "/login";
    }
}
