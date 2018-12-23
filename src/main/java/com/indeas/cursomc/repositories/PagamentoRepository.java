package com.indeas.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indeas.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
