package com.indeas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.indeas.cursomc.domain.Categoria;
import com.indeas.cursomc.repositories.CategoriaRepository;

public class CategoriaService {

	@Autowired
	CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
