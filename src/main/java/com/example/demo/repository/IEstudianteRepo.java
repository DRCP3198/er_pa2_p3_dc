package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	
	public Estudiante buscar(String cedula);
	public Estudiante buscar(Integer id);
	
	public List<Estudiante> buscarTodos();
	
	public void eliminar(Integer id);

}
