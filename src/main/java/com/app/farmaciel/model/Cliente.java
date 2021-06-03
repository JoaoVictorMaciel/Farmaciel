package com.app.farmaciel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id //Gerando um id para o usuario
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size (max = 45, message = "Erro tamanho nome usuário") //Solicitando o nome do usuario
	private String nome; 
	
	@NotNull
	@Size(max = 25, message = "Entre 5 e 25 caracteres")
	private String usuario; //Solicitando um nome de usuario

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
