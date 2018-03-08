package com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fiap.loja.bean.ProdutoTO;
import com.fiap.loja.bo.EstoqueBO;

import br.com.fiap.config.PropertySingleton;

public class TerminalConsulta {

	private static final Logger log = 
			LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		log.warn("Iniciando a aplicação");
		Scanner sc = new Scanner(System.in);
		// ler o código do produto
		Calendar hoje;
		int codigo;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		DecimalFormat df = new DecimalFormat("R$ #,###.00");
		EstoqueBO bo = new EstoqueBO();
		//Recupera os dados da configuração
		Properties prop = PropertySingleton.getInstance();
		log.info("Recuperando as configurações da aplicação");
		String nomeCompleto = prop.getProperty("nome") + " " +
				prop.getProperty("filial");
		do {
			hoje = Calendar.getInstance();
			System.out.println(nomeCompleto+"        " + sdf.format(hoje.getTime()));
			System.out.println("****************************Zero sair");
			System.out.print("Código do Produto: ");
			codigo = sc.nextInt();
			
			if (codigo == 0) {
				System.out.println("Tchau!");
				log.info("Usuário desligando o sistema");
				break;
			}
			
			log.info("Consultando produto " + codigo);
			ProdutoTO produto = bo.consultarProduto(codigo);
			if (produto != null) {
				log.info("Produto encontrado");
				System.out.println("Nome: " + produto.getNome());
				System.out.println("Preço: " + df.format(produto.getPreco()));
				System.out.println("Qtd: " + produto.getQuantidade());
			}else {
				System.out.println("Produto não cadastrado");
				log.error("Produto não encontrado");
			}
			
		} while (codigo != 0);
		sc.close();
		log.warn("Finalizando a aplicação");
	}

}