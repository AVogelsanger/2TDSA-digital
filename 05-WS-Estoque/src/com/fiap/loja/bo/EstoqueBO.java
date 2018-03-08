package com.fiap.loja.bo;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.fiap.loja.bean.ProdutoTO;

/**
 * Classe de negócio que controla o estoque da aplicação
 * @author Thiago Yamamoto
 * @version 1
 * 
 */
public class EstoqueBO {

	/**
	 * Busca o produto pelo código
	 * @param codigo do produto
	 * @return produto 
	 * @throws AxisFault 
	 *  
	 */
	public ProdutoTO consultarProduto(int codigo) throws AxisFault {
		ProdutoTO produto =null;
		switch (codigo) {
		case 401:
			produto = new ProdutoTO(401, "Camiseta Masculina Manga Curta Branca", 50, 100, "Taco");
			break;
		case 402:
			produto = new ProdutoTO(402,"Camiseta Feminina Manga Longa Rosa",200,10,"Forever21");
			break;
		default:
			throw new AxisFault("Produto não cadastrado!");
		}
		return produto;
	}
	
	public List<ProdutoTO> listar(){
		List<ProdutoTO> lista = new ArrayList<>();
		lista.add(new ProdutoTO(401, "Camiseta Feminina", 200, 20, "Forever21"));
		lista.add(new ProdutoTO(402, "Camiseta Masculina", 100, 5, "Plasplus"));
		return lista;
	}
	
	
}