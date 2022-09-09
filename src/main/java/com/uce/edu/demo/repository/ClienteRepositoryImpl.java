package com.uce.edu.demo.repository;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.controller.modelo.Cliente;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository{
	
	@PersistenceContext
	private EntityManager  entityManager; 

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}



	@Override
	public List<Cliente> busarTodos() {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("SELECT c FROM Cliente c");
		return query.getResultList();
	}

}
