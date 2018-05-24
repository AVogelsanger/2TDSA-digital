package br.com.fiap.ws.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ws.dao.FilmeDAO;
import br.com.fiap.ws.entity.Filme;

public class FilmeDAOImpl 
				extends GenericDAOImpl<Filme, Integer>
										implements FilmeDAO{

	public FilmeDAOImpl(EntityManager em) {
		super(em);
	}

}
