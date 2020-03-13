package com.victorgabriel.cursomc.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorgabriel.cursomc.domain.Cliente;
import com.victorgabriel.cursomc.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService categoriaService;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) throws ObjectNotFoundException {
		
		Cliente obj= categoriaService.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
