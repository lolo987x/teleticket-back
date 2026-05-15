package com.example.demo.service;

import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EventoService {
    private final EventoRepository repository;

    public EventoService(EventoRepository repository){
        this.repository= repository;
    }

    public List<Evento>listarEventos(){
        return repository.findAll();
    }

    public Evento buscarEventoPorId(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Evento no encontrado"));
    }

    public Evento agregarEvento(Evento evento){
        return repository.save(evento);
    }

    public void eliminarEvento(Long id){
        repository.deleteById(id); 
    }
    
}
