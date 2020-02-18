package com.luistrujillo.everis.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luistrujillo.everis.modelo.Student;
import com.luistrujillo.everis.service.IStudentsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentsController.class)
public class StudentControllerTests {

    @MockBean
    IStudentsService studentService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;



    @Test
    public void it_should_return_created_student() throws  Exception {

        Student student = new Student();
        student.setFirstName("Liam");
        student.setGender("MASCULINO");
        student.setLastName("Diaz");
        student.setMiddleName("");
        student.setDateOfBirthday(LocalDate.of(2009, 11, 06));
        student.setOtherStudentDetails("Oración");

       // when(studentService.save(any(Student.class))).thenReturn(student);

        mockMvc.perform(post("/students")
                .content(mapper.writeValueAsString(student))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value(student.getFirstName()));
    }
}
