package br.com.fiap.ws.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="T_DBE_NOTICIA")
@SequenceGenerator(name="noticia",sequenceName="SQ_T_DBE_NOTICIA",allocationSize=1)

public class Noticia {
	
	@Id
	@GeneratedValue(generator="noticia",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_titulo", nullable=false, length=50)
	private String titulo;
	
	@Column(name="dt_data")
	private Calendar data;
	
	@Column(name="st_publicado")
	private boolean publicado;
	
	@Column(name="ds_conteudo")
	private String conteudo;

	public Noticia() {
		super();
		
	}

	public Noticia(String titulo, Calendar data, boolean publicado, String conteudo) {
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
