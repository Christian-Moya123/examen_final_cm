package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.controller.modelo.CompraPasaje;
import com.uce.edu.demo.controller.modelo.Vuelo;
import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;
import com.uce.edu.demo.repository.IVueloRepository;


@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	private IVueloRepository vueloRepository;
	
	

	@Override
	public void insertarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepository.insertar(vuelo);
	}

	@Override
	public List<VueloLigero> buscarVuelo(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		return this.vueloRepository.buscarVuelos(origen, destino, fechaVuelo);
	}
	
	
	
	public void actualizarEstado(Vuelo vuelo) {
		this.vueloRepository.actualizarComproPasaje(vuelo);
	}






}
