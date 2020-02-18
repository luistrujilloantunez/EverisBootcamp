package com.luistrujillo.everis.model;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luistrujillo.everis.controller.StudentsController;
//import com.projects.springboot.app.controllers.StudentController;
//import com.projects.springboot.app.entity.Student;
//import com.projects.springboot.app.service.StudentService;
import com.luistrujillo.everis.modelo.Student;
import com.luistrujillo.everis.service.IStudentsService;

//@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(StudentsController.class)
public class StudentTest {
	
	
	/**@Autowired
	private MockMvc mockTest;

	@Autowired
	ObjectMapper objectMapper;

	@MockBean
	private IStudentsService studentService;
	

	//private Student stTest = new Student(1L, "M", "Alejandro", "Mateo", "Gonzales", "Student");

	//metodo listar 
	@Test
	public void AllIsOkTest() throws Exception {
	//	List<Student> students = Arrays.asList(stTest);
	//	when(studentService.listar()).thenReturn(students);
		mockTest.perform(get("/api/students/")).andExpect(status().isOk());
	}

	@Test
	public void CreateIsOkTest() throws Exception {
	//	Student student = stTest;
	//	when(studentService.crear(estu)).thenReturn(student);
	//	mockTest.perform(post("/api/students/").contentType(MediaType.APPLICATION_JSON)
	//			.content(objectMapper.writeValueAsString(student))).andExpect(status().isCreated());
	}

	@Test
	public void FindOneIsOkTest() throws Exception {
		mockTest.perform(get("/api/students/{id}", 1L)).andExpect(status().isOk());	
	}

	@Test
	public void UpdateIsOkTest() throws Exception {
	//	Student student = new Student(1L, "M", "Andrés", "Mateo", "Sarmiento", "Student");
	//	when(studentService.modificar(1L, estu)).thenReturn(estu);
	//	mockTest.perform(patch("/api/students/{id}", 1L).contentType(MediaType.APPLICATION_JSON)
		//		.content(objectMapper.writeValueAsString(student))).andExpect(status().isOk());
	}

	@Test
	public void DeleteIsOkTest() throws Exception {
		mockTest.perform(delete("/api/students/{id}", 1L)).andExpect(status().isNoContent());
	}

     **/
}
