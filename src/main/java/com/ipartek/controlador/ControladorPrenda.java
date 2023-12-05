package com.ipartek.controlador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.modelo.Prenda;
import com.ipartek.repositorio.PrendasRepositorio;

@Controller
public class ControladorPrenda {
	
	@Autowired
	private PrendasRepositorio prendaRepo;
	
	
	@RequestMapping("/guardarPrenda")
	public String agregarPrenda(Prenda prenda)
	{
		prendaRepo.save(prenda);
		
		
		return "redirect:admin";
	}

}