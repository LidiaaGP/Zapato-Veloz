package com.ipartek.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.modelo.Prenda;
import com.ipartek.repositorio.PrendasRepositorio;



@Controller
public class ControladorMenu {
	@Autowired
	private PrendasRepositorio prendaRepositorio;
	
	@RequestMapping("/")
	public String cargarInicio(Model model) {
		List<Prenda> prendas=prendaRepositorio.obtenerPrendasPorTipo("1");
		System.out.println(prendas);
		model.addAttribute("listaPrendas",prendas);
		return "mujer";
	}
	
	@RequestMapping("/mujer")
	public String cargarMujer(Model model) {
		List<Prenda> prendas=prendaRepositorio.obtenerPrendasPorTipo("1");
		System.out.println(prendas);
		
		model.addAttribute("listaPrendas",prendas);
		return "mujer";
	}
	
	@RequestMapping("/hombre")
	public String cargarHombre(Model model) {
		List<Prenda> prendas=prendaRepositorio.obtenerPrendasPorTipo("2");
		System.out.println(prendas);
		
		model.addAttribute("listaPrendas",prendas);
		return "hombre";
	}
	
	@RequestMapping("/infantil")
	public String cargarInfantil(Model model) {
		List<Prenda> prendas=prendaRepositorio.obtenerPrendasPorTipo("3");
		System.out.println(prendas);
		model.addAttribute("listaPrendas",prendas);
		return "infantil";
	}
	
	@RequestMapping("/complementos")
	public String cargarComplementos(Model model) {
		List<Prenda> prendas=prendaRepositorio.obtenerPrendasPorTipo("4");
		System.out.println(prendas);
		model.addAttribute("listaPrendas",prendas);
		return "complementos";
	}
}
