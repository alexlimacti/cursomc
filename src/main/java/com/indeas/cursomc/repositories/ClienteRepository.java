package com.indeas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indeas.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
