package com.example.demo.repository;

import com.example.demo.modelo.Materia;

public interface IMateriaRepo {

	
	public void insertar(Materia materia);
	
	public Materia buscarCodigoMateria(String codigo);
	
	public void eliminar(Materia  materia);
	
}
