package com.luistrujillo.everis.dao;

import com.luistrujillo.everis.modelo.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class FamiliaRepositoryTests {

    @Autowired
    TestEntityManager entityManager;
    @Autowired    IStudentsDAO  studentRepository;

    @Test
    public void it_should_save_student() {
        Student student = new Student();
        student.setFirstName("Liam");
        student.setGender("MASCULINO");
        student.setLastName("Diaz");
        student.setMiddleName("");
        student.setDateOfBirthday(LocalDate.of(2009, 11, 06));
        student.setOtherStudentDetails("Oración");


        student = entityManager.persistAndFlush(student);
        assertThat(studentRepository.findById(student.getId()).get()).isEqualTo(student);
    }
}
