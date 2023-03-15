package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_matri")
	@SequenceGenerator(name = "seq_matri",sequenceName = "seq_matri",allocationSize = 1)
	@Column(name ="matri_id")
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "matri_id_estu")
	private Estudiante estudiantes;
	
	
	@ManyToOne
	@JoinColumn(name ="matri_id_mat")
	private Materia materias;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Estudiante getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(Estudiante estudiantes) {
		this.estudiantes = estudiantes;
	}


	public Materia getMaterias() {
		return materias;
	}


	public void setMaterias(Materia materias) {
		this.materias = materias;
	}
	
	
	

}
