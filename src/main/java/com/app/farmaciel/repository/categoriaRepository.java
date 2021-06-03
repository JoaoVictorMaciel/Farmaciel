package com.app.farmaciel.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.farmaciel.model.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List<Categoria> findByDescricao(String descricao);
	
	

}
