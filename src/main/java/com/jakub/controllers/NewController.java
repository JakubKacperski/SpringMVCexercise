package com.jakub.controllers;

import com.jakub.services.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Good Solution on 21.02.2017.
 */
@Controller
public class NewController {
    @Autowired
    private Car car;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newNew(ModelMap model) {
        model.addAttribute("message", "new controller");
        model.addAttribute("name", "new attribute");
        model.addAttribute("car", car.getCar());
        return "new";
    }
}