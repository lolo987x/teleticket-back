package com.example.demo.controller;

import com.example.demo.model.Compra;
import com.example.demo.service.CompraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compra")
public class CompraController {

    private final CompraService service;

    public CompraController(CompraService service){
        this.service = service;
    }

    @GetMapping
    public List<Compra> listarCompras(){
        return service.listaCompras();
    }

    @GetMapping("/{id}")
    public Compra buscarCompraPorId(@PathVariable Long id){
        return service.buscarCompraPorId(id);
    }

    @PostMapping
    public Compra agregarCompra(@RequestBody Compra compra){
        return service.agregarCompra(compra);
    }

    @DeleteMapping("/{id}")
    public void eliminarCompra(@PathVariable Long id){
        service.eliminarCompra(id);
    }
}