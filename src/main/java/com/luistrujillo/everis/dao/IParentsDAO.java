package com.luistrujillo.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luistrujillo.everis.modelo.Parent;

public interface IParentsDAO extends JpaRepository<Parent, Long>{

}
