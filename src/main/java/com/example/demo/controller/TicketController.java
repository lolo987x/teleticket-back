package com.example.demo.controller;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/ticket")

public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service){
        this.service = service;
    }

    @GetMapping
    public List<Ticket>listarTickets(){
        return service.listarTickets();
    }

    @GetMapping("/{id}")
    public Ticket buscarPorIdTicket(@PathVariable Long id){
        return service.buscarPorIdTicket(id);
    }

    @PostMapping
    public Ticket agregarTicket(@RequestBody Ticket ticket){
        return service.agregarTicket(ticket);
    }
}
