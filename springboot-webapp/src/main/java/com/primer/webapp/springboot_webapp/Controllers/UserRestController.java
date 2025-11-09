package com.primer.webapp.springboot_webapp.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primer.webapp.springboot_webapp.Models.UserModel;


@RestController
@RequestMapping("api/v1")
public class UserRestController {


    @GetMapping("/details")
    public Map<String,Object> details(Model model){
        UserModel user = new UserModel("Alejandro","Román Santos");
        Map<String,Object> body= new HashMap<>();
        body.put("title", "Hola mundo Spring Boot");
        body.put("user", user);

    
        return body;

    }

}
