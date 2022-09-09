package com.uce.edu.demo.controller.modelo.sencillo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VueloLigero {
	
	private String numero;
	private String origen;
	private String destino;
	private String nombreAvion;
	private BigDecimal valorAsiento;
	private LocalDateTime fechaVuelo;
	private String fechaVueloCadena;
	private String estado;
	
	
	
	public VueloLigero() {
		super();
	}

	
	
	public VueloLigero(String numero, String origen, String destino, String categoria, String nombreAvion,
			BigDecimal valorAsiento, String estado) {
		super();
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.nombreAvion = nombreAvion;
		this.valorAsiento = valorAsiento;
		this.estado = estado;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public String getNombreAvion() {
		return nombreAvion;
	}



	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}



	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}



	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}



	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}



	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}



	public String getFechaVueloCadena() {
		return fechaVueloCadena;
	}



	public void setFechaVueloCadena(String fechaVueloCadena) {
		this.fechaVueloCadena = fechaVueloCadena;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	/*public LocalDateTime getFechaVuelo() {
		String[] fechaSeparada = getFechaVueloCadena().split("/");
		return LocalDateTime.of(Integer.parseInt(fechaSeparada[0]) , Integer.parseInt(fechaSeparada[1]), Integer.parseInt(fechaSeparada[2]), 0, 0);
	}*/


	
	
	
	
	

}
