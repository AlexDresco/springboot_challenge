package com.makers.rps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RpsController {


    @GetMapping("/")
    public String homePage() {
        return "home";
    }
}
