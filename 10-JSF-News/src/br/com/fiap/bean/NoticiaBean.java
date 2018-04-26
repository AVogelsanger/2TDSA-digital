package br.com.fiap.bean;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.fiap.ws.service.NoticiaService;
import br.com.fiap.ws.to.NoticiaTO;

public class NoticiaBean {

	private NoticiaTO noticia;
	private NoticiaService service;
	
	@PostConstruct
	private void init() {
		noticia = new NoticiaTO();
		noticia.setData(Calendar.getInstance());
		service = new NoticiaService();
	}
	
	public void excluir(int codigo) {
		FacesMessage msg;
		try {
			service.remover(codigo);
			msg = new FacesMessage("Removido com sucesso.");
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Noticia não removida.");
		}
	}
	
	public List<NoticiaTO> getNoticias() {
		try {
			return service.listar();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String salvar() {
		FacesMessage msg;
		
		try {
			if (noticia.getCodigo() == 0) {
				service.cadastrar(noticia);
				msg = new FacesMessage("Cadastrado com sucesso!");
			}else {
				service.atualizar(noticia);
				msg = new FacesMessage("Atualizado com sucesso!");
				return "lista-noticia.";
			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage("Não foi possível cadastrar!");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "noticia";
	}
	

	public NoticiaTO getNoticia() {
		return noticia;
	}

	public void setNoticia(NoticiaTO noticia) {
		this.noticia = noticia;
	}

	public NoticiaService getService() {
		return service;
	}

	public void setService(NoticiaService service) {
		this.service = service;
	}
	
}
