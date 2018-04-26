package br.com.fiap.ws.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ws.dao.NoticiaDAO;
import br.com.fiap.ws.entity.Noticia;

public class NoticiaDAOImpl extends GenericDAOImpl<Noticia, Integer> implements NoticiaDAO{

	public NoticiaDAOImpl(EntityManager em) {
		super(em);
		
	}

}
