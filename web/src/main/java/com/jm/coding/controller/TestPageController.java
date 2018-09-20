package com.jm.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestPageController {

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
