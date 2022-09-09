package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.controller.modelo.Cliente;
import com.uce.edu.demo.repository.ClienteRepositoryImpl;
import com.uce.edu.demo.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.insertar(cliente);
	}

	@Override
	public List<Cliente> busarTodos() {
		// TODO Auto-generated method stub
		return this.iClienteRepository.busarTodos();
	}

}
