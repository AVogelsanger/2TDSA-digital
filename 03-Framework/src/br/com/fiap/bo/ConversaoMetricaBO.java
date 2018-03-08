package br.com.fiap.bo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConversaoMetricaBO {

	private static final Logger log = 
		LoggerFactory.getLogger(ConversaoMetricaBO.class);
	
	public double converterMilhas(double km) {
		log.debug("Convertendo km para milhas");
		return km/1.604;
	}

	public double converterPolegada(double cm) {
		log.info("Convertendo cm para polegadas");
		return cm/2.54;
	}
	
}