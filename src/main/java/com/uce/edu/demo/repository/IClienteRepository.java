package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.controller.modelo.Cliente;

public interface IClienteRepository {
	void insertar(Cliente cliente);
	
	
	List<Cliente> busarTodos();

}
