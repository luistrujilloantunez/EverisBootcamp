package com.luistrujillo.everis.service;

import java.util.List;
import com.luistrujillo.everis.modelo.Parent;

public interface IParentsService {
	
	public List<Parent> listar();
	public Parent listarPorId(Long parentId);
	public Parent crear(Parent pa);
	public Parent modificar(Parent pa);
	public void eliminar(Long parentId);

}
