package com.ipartek.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="categoria")
	private String categoria;
	
	@OneToMany
	private List<Prenda> listaPrendasEnCategoria;
	

	public Categoria(int id, String categoria, List<Prenda> listaPrendasEnCategoria) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.listaPrendasEnCategoria = listaPrendasEnCategoria;
	}

	public Categoria() {
		super();
		this.id = 0;
		this.categoria = "";
		this.listaPrendasEnCategoria = new ArrayList<Prenda>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Prenda> getListaPrendasEnCategoria() {
		return listaPrendasEnCategoria;
	}

	public void setListaPrendasEnCategoria(List<Prenda> listaPrendasEnCategoria) {
		this.listaPrendasEnCategoria = listaPrendasEnCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria + ", listaPrendasEnCategoria="
				+ listaPrendasEnCategoria + "]";
	}

	
	
	
}
