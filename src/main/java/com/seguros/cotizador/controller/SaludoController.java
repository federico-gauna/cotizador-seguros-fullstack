package com.seguros.cotizador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class SaludoController {
    @GetMapping("/api/saludo")
    public String saludar() {
        return "El cotizador esta funcionando";
    }
}
