package com.victorgabriel.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorgabriel.cursomc.domain.Categoria;
import com.victorgabriel.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id); 
		
		return obj.orElseThrow(() -> new com.victorgabriel.cursomc.services.exceptions.ObjectNotFoundException("Objeto nao encontrado id : "+id
				+", Tipo: "+ Categoria.class.getName()));
		
	}
	 
}
