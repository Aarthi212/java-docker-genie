package com.example.mypkg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/DockerProducts")
    public String index() {
        return "Products"; 
    }
}

