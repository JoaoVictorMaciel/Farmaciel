package com.app.farmaciel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.farmaciel.model.Cliente;
import com.app.farmaciel.model.Produto;

public interface produtoRepository extends JpaRepository<Produto, Long>{
	public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);

}
