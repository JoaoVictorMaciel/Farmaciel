package com.app.farmaciel.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "Produto")
public class Produto {
	
	@Id //Gerando um id para o usuario
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@Size (max = 45, message = "Erro tamanho nome usuário") //Solicitando o nome do usuario
	private String nome;
	
	@Size (max = 255, message = "Erro tamanho descricao") //Solicitando o nome do usuario
	private String descricao;

	@ManyToOne
	//@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties("produtosCadastrados")
	
	private Categoria categoriaCadastrada;
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
