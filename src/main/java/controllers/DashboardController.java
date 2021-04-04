package controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jhudeska on Apr, 2021
 */
@Controller
//@ComponentScan(basePackages = "controllers")
public class DashboardController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String rootView(){
        return "/src/main/resources/templates/index.html";
    }
}