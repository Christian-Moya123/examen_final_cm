package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.controller.modelo.sencillo.VueloLigero;
import com.uce.edu.demo.repository.IVueloRepository;
import com.uce.edu.demo.service.IVueloService;

@SpringBootApplication
public class ExamenFinalCmApplication implements CommandLineRunner{
	@Autowired
	private IVueloService vueloService;
	
	private static Logger logger = Logger.getLogger(ExamenFinalCmApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalCmApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.vueloService.buscarVuelo("ecuador", "barcelona", LocalDateTime.of(2022, 1, 12, 0, 0));
		
	}

}
