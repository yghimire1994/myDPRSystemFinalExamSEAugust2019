package com.yubraj.se.finalexam.dprsystem.mydprsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
        @GetMapping(value = "dprsystem")
        public String displayHome() {
            return "HomePage";
        }
    }

