package de.danielbarth.cv.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniel Barth on 03.05.2015.
 */

@Controller
public class WelcomeCtlr {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
