package com.fiap.loja.bean;

import java.io.Serializable;

/**
 * Classe que armazena as informações de um produto
 * @author Thiago Yamamoto
 * @version 1.0
 * 
 */
public class ProdutoTO implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * Códido do produto
	 */
	private int codigo;
	
	/**
	 * Nome do produto
	 */
	private String nome;
	
	private double preco;
	
	private int quantidade;
	
	private String marca;
	
	public ProdutoTO() {
		super();
	}

	public ProdutoTO(int codigo, String nome, double preco, int quantidade, String marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
