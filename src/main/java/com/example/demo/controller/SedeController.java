package com.example.demo.controller;

import com.example.demo.model.Sede;
import com.example.demo.service.SedeService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/sede")

public class SedeController {
    private final SedeService service;

    public SedeController(SedeService service){
        this.service = service;
    }

    @GetMapping
    public List<Sede>listarSedes(){
        return service.listarSedes();
    }

    @GetMapping("/{id}")
    public Sede buscarSede(@PathVariable Long id){
        return service.buscarPorIdSede(id);
    }

    @PostMapping
    public Sede agregarSede(@RequestBody Sede sede){
        return service.agregarSede(sede);
    }
}
