package br.com.fiap.teste;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.bo.ConversaoMetricaBO;

public class Teste {
	
	private static final Logger log = 
			LoggerFactory.getLogger(Teste.class);

	public static void main(String[] args) {
		log.debug("Iniciando a aplicação");
		ConversaoMetricaBO bo = new ConversaoMetricaBO();
		double milhas = bo.converterMilhas(100);
		System.out.println("100km = " + milhas +" milhas");
		
		double pol = bo.converterPolegada(100);
		System.out.println("100cm = " + pol + " polegadas");
		log.warn("Finalizando a aplicação");
	}
	
}