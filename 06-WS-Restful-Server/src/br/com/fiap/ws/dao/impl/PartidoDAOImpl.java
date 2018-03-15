package br.com.fiap.ws.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ws.dao.PartidoDAO;
import br.com.fiap.ws.entity.Partido;

public class PartidoDAOImpl extends GenericDAOImpl<Partido, Integer> implements PartidoDAO{

	public PartidoDAOImpl(EntityManager em) {
		super(em);
		
	}

}
