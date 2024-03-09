package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ClienteController {

    
    @GetMapping("/")
    public String test(){
        return "Hello World";
    }
    
}
