package com.luistrujillo.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luistrujillo.everis.dao.IParentsDAO;
import com.luistrujillo.everis.modelo.Parent;
import com.luistrujillo.everis.service.IParentsService;

@Transactional
@Service
public class ParentsServiceImpl  implements IParentsService {
	
	
	@Autowired
	private IParentsDAO dao;
	

	//metodo listar
	@Override
	public List<Parent> listar() {
		return dao.findAll();
	}

	//traer por id
	@Override
	public Parent listarPorId(Long parentId) {
		//return dao.findOne( parentId); sprin boot 1.5
		Optional<Parent> op = dao.findById(parentId);
		return op.isPresent() ? op.get() : new Parent();	
	}

	//metodo crear
	@Override
	public Parent crear(Parent pa) {
		return dao.save(pa);
	}

	//modificar
	@Override
	public Parent modificar(Parent pa) {
		return dao.save(pa);
	}

	@Override
	public void eliminar(Long parentId) {
		//dao.delete(id); sprin boot 1.5
		  dao.deleteById(parentId);
	}

}
