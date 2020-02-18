package com.luistrujillo.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luistrujillo.everis.modelo.Parent;
import com.luistrujillo.everis.service.IParentsService;

@RestController
@RequestMapping("/parents")
public class ParentsController {
	
	@Autowired	
	private IParentsService service;
	
	
	//metodo listar
			@GetMapping
			public List<Parent> listar(){
				return service.listar();
			}
			
			@GetMapping(value = "/{id}")
			public Parent listarPorId(@PathVariable("id") Long parentId){
				return service.listarPorId(parentId);
			}
			

			//metodo agregar
			@PostMapping
			public Parent registrar(@RequestBody Parent pa) {
				return service.crear(pa);
			}
			
			//metodo modificar 
			
			@PutMapping
			public Parent modificar(@RequestBody Parent pa) {
				return service.modificar(pa);
			}
			
			
			
		    //metodo eliminar 
			@DeleteMapping(value = "/{id}")
			public void elminar(@PathVariable("id") Long parentId){
				service.eliminar(parentId);
			}
			
			


}
