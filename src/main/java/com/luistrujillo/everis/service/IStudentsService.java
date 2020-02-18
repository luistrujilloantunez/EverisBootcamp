package com.luistrujillo.everis.service;

import java.util.List;
import com.luistrujillo.everis.modelo.Student;

public interface IStudentsService {

	
	public List<Student> listar();
	public Student listarPorId(Long studentId);
	public Student crear(Student estu);
	public Student modificar(Student estu);
	public void eliminar(Long studentId);
}
