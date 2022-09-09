package com.uce.edu.demo.controller.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_secuencia")
	@SequenceGenerator(name = "cliente_secuencia", sequenceName = "clie_secuencia", allocationSize = 1)
	private Integer id;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@Column(name = "clie_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CompraPasaje> clientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CompraPasaje> getClientes() {
		return clientes;
	}

	public void setClientes(List<CompraPasaje> clientes) {
		this.clientes = clientes;
	}
	
	

}
