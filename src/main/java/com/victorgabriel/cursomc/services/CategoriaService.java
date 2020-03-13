package com.victorgabriel.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.victorgabriel.cursomc.domain.Categoria;
import com.victorgabriel.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new com.victorgabriel.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto nao encontrado id : " + id + ", Tipo: " + Categoria.class.getName()));
	}

	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Categoria update(Categoria obj) {
		try {
			find(obj.getId());
		} catch (ObjectNotFoundException e) {
			e.printStackTrace();
		}
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("Nao é possivel excluir uma categoria que possui produtos");
		}
		
		
		
	}
}
