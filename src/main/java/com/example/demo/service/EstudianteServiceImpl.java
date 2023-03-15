package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl  implements IEstudianteService{

	
	@Autowired
	private IEstudianteRepo estudianteRepo;
	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}
	@Override
	public Estudiante encontrar(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(cedula);
	}
	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
		this.estudianteRepo.eliminar(id);
	}
	@Override
	public List<Estudiante> encontrarTodos() {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarTodos();
	}

}
