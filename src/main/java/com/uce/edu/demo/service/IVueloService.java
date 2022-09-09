package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.controller.modelo.Vuelo;
import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;



public interface IVueloService {

	public void insertarVuelo(Vuelo vuelo);
	public List<VueloLigero> buscarVuelo(String origen, String destino, LocalDateTime fechaVuelo);
	
	public void actualizarEstado(Vuelo vuelo);

}
