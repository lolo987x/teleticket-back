package com.example.demo.repository;

import com.example.demo.model.TipoEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TipoEntradaRepository extends JpaRepository<TipoEntrada, Long> {

}