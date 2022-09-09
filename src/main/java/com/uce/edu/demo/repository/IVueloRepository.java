package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.controller.modelo.Vuelo;
import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;



public interface IVueloRepository {
	void insertar(Vuelo vuelo);
	Vuelo buscar(Integer id);
	List<VueloLigero> buscarVuelos(String origen, String destino , LocalDateTime fecha);
	
	public Vuelo buscarPorNumero(String numero);
	
	void actualizarComproPasaje(Vuelo vuelo);
	public Vuelo buscarPorNumeroEstado(String numero);

}
