package com.example.demo.service;

import com.example.demo.model.Sede;
import com.example.demo.repository.SedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SedeService {
    private final SedeRepository repository;

    public SedeService(SedeRepository repository){
        this.repository = repository;
    }

    public List<Sede>listarSedes(){
        return repository.findAll();
    }

    public Sede buscarPorIdSede(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Sede no encontrado"));
    }

    public Sede agregarSede(Sede sede){
        return repository.save(sede);
    }
    
}
