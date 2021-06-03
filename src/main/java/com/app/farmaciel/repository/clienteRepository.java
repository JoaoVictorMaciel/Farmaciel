package com.app.farmaciel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.farmaciel.model.Cliente;


@Repository
public interface clienteRepository extends JpaRepository<Cliente, Long> {
	public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
}
