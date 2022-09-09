package com.uce.edu.demo.controllerr;

import java.time.LocalDateTime;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;
import com.uce.edu.demo.service.IVueloService;


@Controller
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private IVueloService vueloServiceImpl;
	
	@GetMapping("/{origen}/{destino}/{fecha}")
	public String vuelosDisponibles(@PathVariable ("origen") String origen,@PathVariable ("destino") String destino,@PathVariable ("fecha") LocalDateTime fecha, Model modelo) {
		List<VueloLigero> lista = this.vueloServiceImpl.buscarVuelo(origen, destino, fecha);
		modelo.addAttribute("vuelos" ,lista);
		
		return "vistaVuelos";
		
		
	}
	
	

}
