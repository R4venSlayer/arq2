package com.example.demo.controller;

import ch.qos.logback.core.model.Model;
import com.example.demo.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

}
