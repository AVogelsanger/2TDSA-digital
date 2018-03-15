package br.com.fiap.ws.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.core.Response;

import br.com.fiap.ws.dao.PartidoDAO;
import br.com.fiap.ws.dao.impl.PartidoDAOImpl;
import br.com.fiap.ws.entity.Partido;
import br.com.fiap.ws.singleton.EntityManagerFactorySingleton;

public class PartidoResource {

	private PartidoDAO dao;
	
	public PartidoResource() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao =  new PartidoDAOImpl(em);
	}
	
	public Partido buscar(int codigo) {
		return null;
		
	}
	
	public List<Partido> listar(){
		return null;
		
	}
	
	public Response cadastrar(Partido partido) {
		return null;
		
	}
	
	public Response atualizar(Partido partido, int codigo) {
		return null;
		
	}
	
	public void remover() {
		
	}
}
