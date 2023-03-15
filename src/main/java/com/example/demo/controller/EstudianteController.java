package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	
	@Autowired
	private IEstudianteService  estudianteService;
	
	
	@RequestMapping("/inicio")
	public String NuevaVentanaEstudiante(Estudiante estudiante) {
		return "nuevoEstudiante";
	}
	
	@PostMapping("/insertar")
	public String insertarEstudiante(Estudiante estudiante, Model modelo) {
		this.estudianteService.agregar(estudiante);
		Estudiante  estu = new Estudiante();
		modelo.addAttribute("estudiante", estu);
		return "nuevoEstudiante";
	}
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Estudiante> lista= this.estudianteService.encontrarTodos();
		modelo.addAttribute("estudiante", lista);
		return "vistaListaEstudiante";
	}
	
	@DeleteMapping("/borrar/{id}")
	public String borrarPersona(@PathVariable("id") Integer id) {
		 this.estudianteService.borrar(id);
		
		return "redirect:/estudiantes/buscarPorCedula";
	}
	
	@GetMapping("/buscarPorCedula/{cedula}")
	public String buscaPorId(@PathVariable("cedula") String cedula, Model  modelo) {
		Estudiante estu = this.estudianteService.encontrar(cedula);
		modelo.addAttribute("persona", estu);
		return "vistaEstudiante";
		
	}

}
