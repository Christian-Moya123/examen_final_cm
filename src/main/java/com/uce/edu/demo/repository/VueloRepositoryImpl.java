package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.controller.modelo.Vuelo;
import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;



@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{
	
	@PersistenceContext
	private EntityManager entityManager ;

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public List<VueloLigero> buscarVuelos(String origen, String destino, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		TypedQuery<VueloLigero> myQuery = this.entityManager.createQuery(
                "SELECT NEW com.uce.edu.demo.controller.modelo.sencillo.VueloLigero(vl.numero, vl.origen, vl.destino, vl.avion.nombre, vl.valorAsiento, vl.estado) FROM Vuelo vl WHERE vl.origen = :origen AND vl.destino =:destino AND vl.fechaVuelo =:fechaVuelo",VueloLigero.class);
        myQuery.setParameter("origen", origen);
        myQuery.setParameter("destino", destino);
        myQuery.setParameter("fechaVuelo", fecha);
        return myQuery.getResultList();
	}



	@Override
	public Vuelo buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT v  FROM Vuelo v WHERE v.categoria = :origen AND v.numero =: numero",Vuelo.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}
	


	@Override
	public void actualizarComproPasaje(Vuelo vuelo) {
		// TODO Auto-generated method stub
		Vuelo vuelos = buscarPorNumero(vuelo.getNumero());
		vuelos.setNumero(vuelo.getNumero());
		
		
	}

	@Override
	public Vuelo buscarPorNumeroEstado(String numero) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery(
                "SELECT v  FROM Vuelo v WHERE v.categoria = :origen AND v.numero =: numero  AND v.estado =:estado",
                Vuelo.class);
		myQuery.setParameter("numero", numero);
		myQuery.setParameter("estado", "DIS");
		return myQuery.getSingleResult();
	}

}
