package com.example.ejemploSpringBoot.controller;

import com.example.ejemploSpringBoot.ejemplosPOO.PuraSangre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class prueba {

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
    @GetMapping("/caballo")
    public PuraSangre getCaballo(){
        return new PuraSangre("pepe");
    }
}
