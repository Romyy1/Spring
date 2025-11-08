package com.primer.webapp.springboot_webapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {


    @GetMapping("/details")
    public String details(Model model){

        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("user", "Hola mundo soy Alejandro");
        model.addAttribute("ejemplo", "Hola mundo esto es un ejemplo");

        

        return "details";

    }

}
