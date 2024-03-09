package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ClienteController {

    
    @GetMapping("/")
    public String test(){
        return "Hello World";
    }
    
}
