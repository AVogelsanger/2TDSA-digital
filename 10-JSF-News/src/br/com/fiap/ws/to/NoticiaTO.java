package br.com.fiap.ws.to;

import java.util.Calendar;

public class NoticiaTO {
	
	private int codigo;
	
	private String titulo;
	
	private Calendar data;

	private boolean publicado;
	
	private String conteudo;
	
	public NoticiaTO() {
		super();
		
	}

	public NoticiaTO(String titulo, Calendar data, boolean publicado, String conteudo) {
		super();
		
		this.titulo = titulo;
		this.data = data;
		this.publicado = publicado;
		this.conteudo = conteudo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public boolean isPublicado() {
		return publicado;
	}

	public void setPublicado(boolean publicado) {
		this.publicado = publicado;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
}
