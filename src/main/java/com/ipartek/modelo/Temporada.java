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
@Table(name = "temporadas")
public class Temporada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="temporada")
	private String temporada;
	
	@OneToMany
	private List<Prenda> listaPrendasEnTemporada;
	

	
	public Temporada(int id, String temporada, List<Prenda> listaPrendasEnTemporada) {
		super();
		this.id = id;
		this.temporada = temporada;
		this.listaPrendasEnTemporada = listaPrendasEnTemporada;
	}

	public Temporada() {
		super();
		this.id = 0;
		this.temporada = "";
		this.listaPrendasEnTemporada = new ArrayList<Prenda>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	
	public List<Prenda> getListaPrendasEnTemporada() {
		return listaPrendasEnTemporada;
	}

	public void setListaPrendasEnTemporada(List<Prenda> listaPrendasEnTemporada) {
		this.listaPrendasEnTemporada = listaPrendasEnTemporada;
	}

	@Override
	public String toString() {
		return "Temporada [id=" + id + ", temporada=" + temporada + ", listaPrendasEnTemporada="
				+ listaPrendasEnTemporada + "]";
	}
	
	
	
	
	
	
}
