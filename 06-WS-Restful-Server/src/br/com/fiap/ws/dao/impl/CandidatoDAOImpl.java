package br.com.fiap.ws.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.ws.dao.CandidatoDAO;
import br.com.fiap.ws.entity.Candidato;

public class CandidatoDAOImpl extends GenericDAOImpl<Candidato, Integer> implements CandidatoDAO{

	public CandidatoDAOImpl(EntityManager em) {
		super(em);
		
	}

}
