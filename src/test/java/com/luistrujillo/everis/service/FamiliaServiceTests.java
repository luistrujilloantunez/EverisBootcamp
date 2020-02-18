package com.luistrujillo.everis.service;

import com.luistrujillo.everis.dao.IStudentsDAO;
import com.luistrujillo.everis.modelo.Student;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class FamiliaServiceTests {

    @Mock
    IStudentsDAO studentRepository;

    @InjectMocks
    IStudentsService studentService;

    @Test
    void deberiaGuardarStudent(){
        Student student = new Student();
        student.setFirstName("Liam");
        student.setGender("MASCULINO");
        student.setLastName("Diaz");
        student.setMiddleName("");
        student.setDateOfBirthday(LocalDate.of(2009, 11, 06));
        student.setOtherStudentDetails("Oración");

        when(studentRepository.save(any(Student.class))).thenReturn(student);
        Student created =  studentService.crear(student);

        assertThat(created.getFirstName()).isSameAs(student.getFirstName());
    }
}
