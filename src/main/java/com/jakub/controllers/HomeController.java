package com.jakub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Good Solution on 21.02.2017.
 */
@Controller
public class HomeController {
//    @Autowired
//    private HomeService homeService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("message", "hello");
        return "home";
    }
}