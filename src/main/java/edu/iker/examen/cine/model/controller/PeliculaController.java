package edu.iker.examen.cine.model.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class PeliculaController {
    @RequestMapping("api/peliculas")
    public String requestMethodName(@RequestParam String param) {

        return new String();
    }
    
    
}
