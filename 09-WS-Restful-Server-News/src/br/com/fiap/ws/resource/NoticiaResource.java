package br.com.fiap.ws.resource;

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

import br.com.fiap.ws.dao.NoticiaDAO;
import br.com.fiap.ws.dao.impl.NoticiaDAOImpl;
import br.com.fiap.ws.entity.Noticia;
import br.com.fiap.ws.exception.CommitException;
import br.com.fiap.ws.singleton.EntityManagerFactorySingleton;

@Path("/noticia")
public class NoticiaResource {

	private NoticiaDAO dao;

	public NoticiaResource() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new NoticiaDAOImpl(em);
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Noticia buscar(@PathParam("id") int codigo) {
		return dao.buscar(codigo);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> listar() {
		return dao.listar();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Noticia noticia, @Context UriInfo uri) {
		try {
			dao.cadastrar(noticia);
			dao.commit();
			UriBuilder b = uri.getAbsolutePathBuilder();
			b.path(String.valueOf(noticia.getCodigo()));
			return Response.created(b.build()).build();
		} catch (CommitException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@PUT
	@Path("/{codigo}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Noticia noticia, @PathParam("codigo") int codigo) {

		try {
			noticia.setCodigo(codigo);
			dao.atualizar(noticia);
			dao.commit();
			return Response.ok().build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}
	
	@DELETE
	@Path("/{codigo}")
	public void remover(@PathParam("codigo") int codigo) {
		
		try {
			dao.excluir(codigo);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
		}
	}
}
