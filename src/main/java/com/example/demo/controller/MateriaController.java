package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Materia;
import com.example.demo.service.IMateriaService;


@Controller
@RequestMapping("/materias")
public class MateriaController {	
		
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/inicio")
	public String nuevaVentanaMateria(Materia materia) {
		return "nuevaMateria";
	}
		
		
		@PostMapping("/insertar")
		public String insertarMateria(Materia materia,Model model) {
			this.iMateriaService.insertar(materia);
			Materia mat= new Materia();
			model.addAttribute("materia", mat);
			return "nuevaMateria";
		}
	
		

	


}
