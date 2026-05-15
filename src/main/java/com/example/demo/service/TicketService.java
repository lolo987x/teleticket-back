package com.example.demo.service;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TicketService {
    private final TicketRepository repository;

    public TicketService(TicketRepository repository){
        this.repository = repository;
    }

    public List<Ticket>listarTickets(){
        return repository.findAll();
    }

    public Ticket buscarPorIdTicket(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Ticket no encontrado"));
    }

    public Ticket agregarTicket(Ticket ticket){
        return repository.save(ticket);
    }

    public void eliminarTicket(Long id){
        repository.deleteById(id);
    }
}
