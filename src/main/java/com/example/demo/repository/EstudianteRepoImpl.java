package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import aj.org.objectweb.asm.Type;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl  implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery< Estudiante> query = this.entityManager.createQuery("select e from Estudiante e where e.cedula=:datoCedula", Estudiante.class);
		query.setParameter("datoCedula", cedula);
		return query.getResultList().get(0);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante  e = this.buscar(id);
		this.entityManager.remove(e);
	}

	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery< Estudiante> query = this.entityManager.createQuery("select e from Estudiante e ", Estudiante.class);
		
		return query.getResultList();
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Estudiante.class, id);
	}

}
