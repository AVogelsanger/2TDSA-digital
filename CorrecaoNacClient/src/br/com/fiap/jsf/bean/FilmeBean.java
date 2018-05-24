package br.com.fiap.jsf.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.ws.service.FilmeService;
import br.com.fiap.ws.to.Filme;

@ManagedBean
public class FilmeBean {

	private FilmeService service;
	private Filme filme;
	
	//m�todo de inicializa��o
	@PostConstruct
	private void init() {
		service = new FilmeService();
		setFilme(new Filme());
	}
	
	//M�todo para enviar a lista de fimes para a p�gina
	public List<Filme> listar(){
		
		try {
			return service.listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	
	//M�todo para o clique do bot�o
	public String cadastrar() {
		FacesMessage msg;
		try {
			service.cadastrar(filme);
			msg = new FacesMessage("Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Erro");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		//Manter a msg ap�s um redirect
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		return "filme?faces-redirect=true";
	}
	

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
