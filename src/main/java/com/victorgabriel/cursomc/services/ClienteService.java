package com.victorgabriel.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victorgabriel.cursomc.domain.Categoria;
import com.victorgabriel.cursomc.domain.Cliente;
import com.victorgabriel.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) throws ObjectNotFoundException {
		
		Optional<Cliente> obj = repo.findById(id); 
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado id : "+id+", Tipo: "+ Categoria.class.getName()));
	}
		
	 
}
