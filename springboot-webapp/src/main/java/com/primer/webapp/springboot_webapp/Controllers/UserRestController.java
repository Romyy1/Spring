package com.primer.webapp.springboot_webapp.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1")
public class UserRestController {


    @GetMapping("/details")
    public Map<String,Object> details(Model model){

        Map<String,Object> body= new HashMap<>();
        body.put("title", "Hola mundo Spring Boot");
        body.put("user", "Hola mundo soy Alejandro");
        body.put("ejemplo", "Hola mundo esto es un ejemplo");

        

        return body;

    }

}
