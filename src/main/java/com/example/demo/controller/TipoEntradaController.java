package com.example.demo.controller;

import com.example.demo.model.TipoEntrada;
import com.example.demo.service.TipoEntradaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipodeentrada")

public class TipoEntradaController {
    
    private final TipoEntradaService service;

    public TipoEntradaController(TipoEntradaService service){
        this.service = service;
    }
    
    @GetMapping
    public List<TipoEntrada> listarTipoEntradas() {
        return service.listarTipoEntradas();
    }

    @GetMapping("/{id}")
    public TipoEntrada buscarTipoEntrada(@PathVariable Long id) {
        return service.buscaridTipoEntrada(id);
    }
}
