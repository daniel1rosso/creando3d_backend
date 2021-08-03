package com.andorialabs.creando_3d.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SeguridadControlador {
    
    @RequestMapping("/login")
    public Principal login(Principal usuario){
        return usuario;
    }
}
