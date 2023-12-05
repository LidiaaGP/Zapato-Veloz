package com.ipartek.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ipartek.modelo.Prenda;

@Repository
public interface PrendasRepositorio extends JpaRepository<Prenda, Integer>{
	@Query(value = "SELECT * FROM prendas WHERE categoria_id = :valor",nativeQuery = true)
	List<Prenda> obtenerPrendasPorTipo(@Param("valor") String valor);
}
