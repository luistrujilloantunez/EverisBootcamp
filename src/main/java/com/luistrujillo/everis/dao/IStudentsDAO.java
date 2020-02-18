package com.luistrujillo.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luistrujillo.everis.modelo.Student;

public interface IStudentsDAO  extends JpaRepository<Student, Long> {

}
