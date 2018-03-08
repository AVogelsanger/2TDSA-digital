package com.fiap.loja.bo;

import com.fiap.loja.bean.ProdutoTO;

public class EstoqueBO {

	public ProdutoTO consultarProduto(int codigo) {
		ProdutoTO produto =null;
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401, "Camiseta Masculina Manga Curta Branca", 50, 100, "Taco");
			break;
		case 402:
			produto = new ProdutoTO(402,"Camiseta Feminina Manga Longa Rosa",200,10,"Forever21");
			break;
		}
		return produto;
	}
	
}