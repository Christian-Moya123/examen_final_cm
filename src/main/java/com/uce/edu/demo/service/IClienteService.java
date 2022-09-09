package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.controller.modelo.Cliente;

public interface IClienteService {
	
	void insertar(Cliente cliente);
	
	List<Cliente> busarTodos();

}
