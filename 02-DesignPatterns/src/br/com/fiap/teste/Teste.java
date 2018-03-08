package br.com.fiap.teste;

import java.util.Properties;
import br.com.fiap.config.PropertySingleton;

public class Teste {

	public static void main(String[] args) {
		//Recebe o objeto que carrega as configurações
		Properties p = PropertySingleton.getInstance();
		//Recupera uma configuração do arquivo
		String modo = p.getProperty("modo");
		System.out.println(modo);
	}
	
}