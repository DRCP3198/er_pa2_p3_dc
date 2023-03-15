package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaTmp;
import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.repository.IMateriaRepo;
import com.example.demo.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
    
	@Autowired
	private IMatriculaRepo matriculaRepo;
	@Autowired
	private IMateriaRepo materiaRepo;
	
	
	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public void agregar(Matricula matriculaTmp) {
		// TODO Auto-generated method stub
//		Estudiante estu= this.estudianteRepo.buscar(matriculaTmp.getCedulaE());
//		Materia mat = this.materiaRepo.buscarCodigoMateria(matriculaTmp.getCodigoM());
		MatriculaTmp temporal = new MatriculaTmp();
	   this.matriculaRepo.insertar(matriculaTmp);
	}
	
	

}
