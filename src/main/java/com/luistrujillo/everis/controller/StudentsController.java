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
import com.luistrujillo.everis.modelo.Student;
import com.luistrujillo.everis.service.IStudentsService;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired	
	private IStudentsService service;
	
	
	//metodo listar
		@GetMapping
		public List<Student> listar(){
			return service.listar();
		}
		
		@GetMapping(value = "/{id}")
		public Student listarPorId(@PathVariable("id") Long studentId){
			return service.listarPorId(studentId);
		}
		

		//metodo agregar
		@PostMapping
		public Student registrar(@RequestBody Student estu) {
			return service.crear(estu);
		}
		
		//metodo modificar 
		
		@PutMapping
		public Student modificar(@RequestBody Student estu) {
			return service.modificar(estu);
		}
		
		
		
	    //metodo eliminar 
		@DeleteMapping(value = "/{id}")
		public void elminar(@PathVariable("id") Long studentId){
			service.eliminar(studentId);
		}
		
		

}
