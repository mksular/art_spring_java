package com.uby.art.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("single")
    public String single() {
        return "single";
    }

    @GetMapping("event")
    public String event() {
        return "event";
    }
    
    @GetMapping("travel")
    public String travel() {
        return "travel";
    }

    @GetMapping("about")
    public String about() {
        return "about";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }
}
