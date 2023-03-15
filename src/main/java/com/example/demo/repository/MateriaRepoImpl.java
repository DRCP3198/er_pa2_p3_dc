package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public Materia buscarCodigoMateria(String codigo) {
		// TODO Auto-generated method stub

		TypedQuery<Materia> query = this.entityManager.createQuery("select e from Materia e where e.codigo=:datoCodigo",
				Materia.class);
		query.setParameter("datoCodigo", codigo);
		return query.getResultList().get(0);
	}

	@Override
	public void eliminar(Materia materia) {
		// TODO Auto-generated method stub
         this.entityManager.remove(materia);
	}

}
