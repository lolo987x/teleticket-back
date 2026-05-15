package com.example.demo.service;

import com.example.demo.model.Compra;
import com.example.demo.repository.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CompraService {
    private final CompraRepository repository;

    public CompraService(CompraRepository repository){
        this.repository = repository;
    }

    public List<Compra>listaCompras(){
        return repository.findAll();
    }

    public Compra buscarCompraPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Compra no encontrada"));
    }

    public Compra agregarCompra(Compra compra){
        return repository.save(compra);
    }

    public void eliminarCompra(Long id){
        repository.deleteById(id);
    }
    
}
