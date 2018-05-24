package br.com.fiap.ws.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.ws.to.Filme;

public class FilmeService {

	public static final String URL = "http://localhost:8080/CorrecaoNacServer/rest/filme";
	
	private Client client = Client.create();
	
	public void cadastrar(Filme filme) throws Exception {
		WebResource resource = client.resource(URL);
		ClientResponse resp = resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, filme);
		
		if (resp.getStatus() != 201) {
			throw new Exception("Erro");
		}
	}
	
	public void atualizar(Filme filme) throws Exception {
		WebResource resource = client.resource(URL).path(String.valueOf(filme.getCodigo()));
		ClientResponse resp = resource.type(MediaType.APPLICATION_JSON).put(ClientResponse.class,filme);
		
		if (resp.getStatus() != 200) {
			throw new Exception("Erro");
		}
	}
	
	public void remover(int codigo) throws Exception {
		WebResource resource = client.resource(URL).path(String.valueOf(codigo));
		ClientResponse resp = resource.delete(ClientResponse.class);
		
		if (resp.getStatus() != 204) {
			throw new Exception("Erro");
		}
	}
	
	public List<Filme> listar() throws Exception{
		WebResource resource = client.resource(URL);
		ClientResponse resp = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if (resp.getStatus() != 200) {
			throw new Exception("Erro");
		}
		return Arrays.asList(resp.getEntity(Filme[].class));
	}
}
