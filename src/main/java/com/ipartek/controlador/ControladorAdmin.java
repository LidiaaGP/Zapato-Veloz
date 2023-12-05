package com.ipartek.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.modelo.Categoria;
import com.ipartek.modelo.Prenda;
import com.ipartek.modelo.Temporada;
import com.ipartek.repositorio.CategoriaRepositorio;
import com.ipartek.repositorio.TemporadaRepositorio;



@Controller
public class ControladorAdmin {
	
	@Autowired
	private CategoriaRepositorio categoriaRepo;
	
	@Autowired
	private TemporadaRepositorio temporadaRepo;
	
	@RequestMapping("/admin")
	public String cargarAdministracion(Prenda prenda, Temporada temporada, Model model) {
		
		List<Categoria> listaCategorias=categoriaRepo.obtenerTodasCategorias();
		model.addAttribute("categorias",listaCategorias);
		

		model.addAttribute("temporadas",temporadaRepo.findAll());
		
		
		return "admin";
	}
}
