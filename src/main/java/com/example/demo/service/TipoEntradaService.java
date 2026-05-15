package com.example.demo.service;

import com.example.demo.model.TipoEntrada;
import com.example.demo.repository.TipoEntradaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEntradaService {
    private final TipoEntradaRepository repository;

    public TipoEntradaService(TipoEntradaRepository repository){
        this.repository = repository;
    }

    public List<TipoEntrada>listarTipoEntradas(){
        return repository.findAll();
    }

    public TipoEntrada buscaridTipoEntrada(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tipo de Entrada no encontrada"));
    }
}
