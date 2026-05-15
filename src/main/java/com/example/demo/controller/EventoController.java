package com.example.demo.controller;

import com.example.demo.model.Evento;
import com.example.demo.service.EventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evento")
public class EventoController {

    private final EventoService service;

    public EventoController(EventoService service){
        this.service = service;
    }

    @GetMapping
    public List<Evento> listarEvento(){
        return service.listarEventos();
    }

    @GetMapping("/{id}")
    public Evento buscarEvento(@PathVariable Long id){
        return service.buscarEventoPorId(id);
    }

    @PostMapping
    public Evento agregarEvento(@RequestBody Evento evento){
        return service.agregarEvento(evento);
    }

    @DeleteMapping("/{id}")
    public void eliminarEvento(@PathVariable Long id){
        service.eliminarEvento(id);
    }
}