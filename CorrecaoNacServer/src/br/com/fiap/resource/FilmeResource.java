package br.com.fiap.resource;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.ws.dao.FilmeDAO;
import br.com.fiap.ws.dao.impl.FilmeDAOImpl;
import br.com.fiap.ws.entity.Filme;
import br.com.fiap.ws.exception.CommitException;
import br.com.fiap.ws.singleton.EntityManagerFactorySingleton;

@Path("/filme")
public class FilmeResource {

	private FilmeDAO dao;
	
	public FilmeResource() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new FilmeDAOImpl(em);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Filme filme, @Context UriInfo uri) {
		
		try {
			dao.cadastrar(filme);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
		UriBuilder b = uri.getAbsolutePathBuilder();
		b.path(String.valueOf(filme.getCodigo()));
		return Response.created(b.build()).build();
	}
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Filme filme, @PathParam("id") int codigo) {
		
		
		try {
			filme.setCodigo(codigo);
			dao.atualizar(filme);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{id}")
	public void remover(@PathParam("id") int codigo){
		try {
			dao.remover(codigo);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Filme> listar(){
		return dao.listar();
	}
	
	
}
