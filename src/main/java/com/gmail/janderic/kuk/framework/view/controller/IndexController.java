package com.gmail.janderic.kuk.framework.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String root(Model model) {
        model.addAttribute("msg", "请求的root");
        return "/login";
    }
}
