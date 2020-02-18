package com.luistrujillo.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luistrujillo.everis.dao.IStudentsDAO;
import com.luistrujillo.everis.modelo.Student;
import com.luistrujillo.everis.service.IStudentsService;

@Transactional
@Service
public class StudentsServiceImpl implements IStudentsService{

	@Autowired
	private IStudentsDAO dao;
	
	
	//metodo listar
	@Override
	public List<Student> listar() {
		return dao.findAll();
	}

	//traer por id 
	@Override
	public Student listarPorId(Long studentId) {
		//return dao.findOne(id); sprin boot 1.5
				Optional<Student> op = dao.findById(studentId);
				return op.isPresent() ? op.get() : new Student();	
	}

	//metodo crear 
	@Override
	public Student crear(Student estu) {
		return dao.save(estu);
		
	}

	//metodo modificar
	@Override
	public Student modificar(Student estu) {
		return dao.save(estu);
	}

	@Override
	public void eliminar(Long studentId) {
		//dao.delete(id); sprin boot 1.5
		  dao.deleteById(studentId);
	}

}
