package com.homework.first.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("pageName", "index");

        return "default";
    }

    @RequestMapping(value = {"/about"}, method = RequestMethod.GET)
    public String about(Model model) {

        model.addAttribute("pageName", "about");

        return "default";
    }

    @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
    public String contact(Model model) {

        model.addAttribute("pageName", "contact");

        return "default";
    }
}
