package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	
	public Estudiante encontrar(String id);
	
	public void borrar(Integer id);
	
	public List<Estudiante> encontrarTodos();

}
