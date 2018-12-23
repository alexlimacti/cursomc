package com.indeas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indeas.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
