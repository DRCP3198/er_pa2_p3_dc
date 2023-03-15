package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Matricula;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	@RequestMapping("/inicio")
	public String NuevaVentanaMatricula(Matricula matricula) {
		return "nuevoEstudiante";
	}
	
	@PostMapping("/insertar")
	public String insertarEstudiante(Matricula matricula, Model modelo) {
		this.iMatriculaService.agregar(matricula);
		Estudiante  estu = new Estudiante();
		modelo.addAttribute("estudiante", estu);
		return "nuevoEstudiante";
	}

}
